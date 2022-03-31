package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> predicateName = (Person person) -> person.getName().contains(key);
        Predicate<Person> predicateSurname = (Person person) -> person.getSurname().contains(key);
        Predicate<Person> predicatePhone = (Person person) -> person.getPhone().contains(key);
        Predicate<Person> predicateAddress = (Person person) -> person.getAddress().contains(key);
        Predicate<Person> combine = predicateName.or(predicateSurname.or(predicatePhone.or(predicateAddress)));

        for (Person person:persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }

}
