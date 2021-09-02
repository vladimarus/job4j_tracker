package ru.job4j.poly;

public class PolyVehicle {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle airplain = new Airplain();
        Vehicle bus = new Autobus();
        Vehicle[] vehicles = new Vehicle[]{train, airplain, bus};
        for (Vehicle unit : vehicles) {
            unit.move();
        }
    }
}
