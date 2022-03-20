package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void dublAddCitizen() {
        Citizen citizen = new Citizen("12345", "User userov");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertFalse(office.add(new Citizen("12345", "New newov")));
    }

}