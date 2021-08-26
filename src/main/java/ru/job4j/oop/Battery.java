package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int startLoad) {
        load = startLoad;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }
}
