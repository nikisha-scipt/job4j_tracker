package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenNewArrayListIsEmpty() {
        var address = new PhoneDictionary();
        address.add(
                new Person("Danil", "Nikishin", "1236456", "Moscow")
        );
        var personArrayList = address.find("abra-cadabra");
        assertTrue(personArrayList.isEmpty());
    }

}