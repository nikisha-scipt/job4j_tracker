package ru.job4j.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " flies through the air");
    }

    @Override
    public void vehicle() {
        System.out.println("It is " + getClass().getSimpleName());
    }
}
