package ru.job4j.oop.profession;

public class Doctor extends Profession {
    private final String location;

    public Doctor(String name, String surename, String education, String birthday, String location) {
        super(name, surename, education, birthday);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public Diagnosis diagnosing(Patient patient) {
        return null;
    }

    public Diagnosis healing(Patient patient) {
        return null;
    }
}
