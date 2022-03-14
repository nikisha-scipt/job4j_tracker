package ru.job4j.search;

import org.junit.Test;
import java.util.ArrayList;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenNewArrayListIsEmpty() {
        PhoneDictionary address = new PhoneDictionary();
        address.add(
                new Person("Danil", "Nikishin", "1236456", "Moscow")
        );
        ArrayList<Person> personArrayList = address.find("abra-cadabra");
        assertTrue(personArrayList.isEmpty());
    }

}