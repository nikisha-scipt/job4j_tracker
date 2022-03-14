package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person object:persons) {
            if (key.contains(object.getName())
                    || key.contains(object.getSurname())
                    || key.contains(object.getAddress())
                    || key.contains(object.getPhone())) {
                result.add(object);
            }
        }
        return result;
    }

}
