package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.MatcherAssert.assertThat;

public class JobTest {

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAsc() {
        Comparator<Job> ascComp = new JobAscByName();
        int res = ascComp.compare(
                new Job("test1", 0),
                new Job("test2", 2)
        );
        assertThat(res, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityAsc() {
        Comparator<Job> ascComp = new JobAscByPriority();
        int res = ascComp.compare(
                new Job("test1", 0),
                new Job("test2", 2)
        );
        assertThat(res, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityDesc() {
        Comparator<Job> ascComp = new JobDescByPriority();
        int res = ascComp.compare(
                new Job("test2", 2),
                new Job("test1", 0)
        );
        assertThat(res, lessThan(0));
    }

    @Test
    public void whenComparatorByNameDesc() {
        Comparator<Job> ascComp = new JobDescByName();
        int res = ascComp.compare(
                new Job("test2", 2),
                new Job("test1", 0)
        );
        assertThat(res, lessThan(0));
    }

    @Test
    public void whenComparatorByJobDescByNameLn() {
        Comparator<Job> ascComp = new JobDescByNameLn();
        int res = ascComp.compare(
                new Job("test22", 2),
                new Job("test1", 0)
        );
        assertThat(res, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAscAndPriorityAsc() {
        Comparator<Job> ascComp = new JobAscByName().thenComparing(new JobAscByPriority());
        int res = ascComp.compare(
                new Job("test1", 0),
                new Job("test1", 2)
        );
        assertThat(res, lessThan(0));
    }

    @Test
    public void whenComparatorByAll() {
        Comparator<Job> ascComp = new JobAscByName()
                .thenComparing(new JobAscByPriority())
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByNameLn())
                .thenComparing(new JobDescByPriority());
        int res = ascComp.compare(
                new Job("test1", 0),
                new Job("test2", 2)
        );
        assertThat(res, lessThan(0));
    }

}