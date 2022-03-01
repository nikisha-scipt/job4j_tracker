package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Danil");
        student.setSurname("Nikishin");
        student.setPatronymic("Dmitrievich");
        student.setGroup("Best Group");
        student.setBeginStudy(new Date());

        System.out.println("Name: " + student.getName() + System.lineSeparator()
                + "Surname: " + student.getSurname() + System.lineSeparator()
                + "Patronymic: " + student.getPatronymic() + System.lineSeparator()
                + "Group: " + student.getGroup() + System.lineSeparator()
                + "Begin Studying: " + student.getBeginStudy());
    }

}
