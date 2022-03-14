package ru.job4j.oop;

public class HierarchyUsage {

    public static void main(String[] args) {
        Car car = new Car();
        Transport transport = car;
        Object obj = car;
        Object ocar = new Car();
        Car carFromObject = (Car) ocar;
        Object bicycle = new Bicycle();
        Car cb = (Car) bicycle; // код завершится с ошибок приведения типов ClassCastException
    }

}
