package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String firstDep, String secondDep) {
        String[] firstDepArray = firstDep.split("/");
        String[] secondDepArray = secondDep.split("/");
        if (secondDepArray[0].compareTo(firstDepArray[0]) == 0) {
            return  firstDep.compareTo(secondDep);
        }
        return secondDepArray[0].compareTo(firstDepArray[0]);
    }

}
