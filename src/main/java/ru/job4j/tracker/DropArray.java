package ru.job4j.tracker;

import java.util.Arrays;

public class DropArray {
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", null};
        String[] rsl = new String[names.length];
        int size = 0;
        for (String name : names) {
            if (name != null) {
                rsl[size] = name;
                size++;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        for (String s : rsl) {
            System.out.println(s);
        }

        String[] namesCopy = {"Petr", null, "Ivan", "Stepan", "Fedor"};
        System.arraycopy(namesCopy, 2, namesCopy, 1, 3);
        System.out.println(Arrays.toString(namesCopy));
    }
}
