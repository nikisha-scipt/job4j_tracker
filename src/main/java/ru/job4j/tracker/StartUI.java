package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter frt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String date = item.getCreated().format(frt);
        System.out.println(date);
    }

}
