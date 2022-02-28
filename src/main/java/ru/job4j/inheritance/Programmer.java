package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String level;

    public Programmer(String name, String surname, String education, String birthday, String experience) {
        super(name, surname, education, birthday, experience);
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
