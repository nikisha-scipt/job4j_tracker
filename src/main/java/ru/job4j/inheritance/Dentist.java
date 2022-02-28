package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String experience;

    public Dentist(String name, String surname, String education, String birthday, String experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public String getExperience() {
        return experience;
    }
}
