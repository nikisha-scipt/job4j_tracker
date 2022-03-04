package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " moving on rails");
    }

    @Override
    public void vehicle() {
        System.out.println("It is " + getClass().getSimpleName());
    }
}
