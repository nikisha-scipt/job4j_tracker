package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String level;

    public Programmer(String name, String surname, String education, String birthday, String experience, String level) {
        super(name, surname, education, birthday, experience);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
