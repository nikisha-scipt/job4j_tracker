package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String salary;

    public Builder(String name, String surname, String education, String birthday, String salary, String experience) {
        super(name, surname, education, birthday, experience);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }
}
