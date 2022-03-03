package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }

    @Override
    public void countOfPassenger(int count) {
        System.out.println("All count of passenger: " + count);
    }

    @Override
    public int refuel(int countOfFuel) {
        return countOfFuel + 1;
    }

}
