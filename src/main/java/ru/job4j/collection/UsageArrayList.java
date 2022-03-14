package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collection;

public class UsageArrayList {

    public static void main(String[] args) {
        Collection<String> arrayList = new ArrayList<>();
        arrayList.add("Petr");
        arrayList.add("Ivan");
        arrayList.add("Stepan");

        for (String object : arrayList) {
            System.out.println(object);
        }
    }

}
