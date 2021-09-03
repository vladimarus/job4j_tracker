package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        for (int i = 0; i < 10; i++) {
            System.out.println("driving");
        }
    }

    @Override
    public void passengers(int n) {
        System.out.println("Число пассажиров автобуса: " + n);
    }

    @Override
    public int refuel(int litres) {
        return litres * 40;
    }
}
