package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String firstDep, String secondDep) {
        String[] firstDepArray = firstDep.split("/");
        String[] secondDepArray = secondDep.split("/");
        int rsl = secondDepArray[0].compareTo(firstDepArray[0]);
        return rsl != 0 ? rsl : firstDep.compareTo(secondDep);
    }

}
