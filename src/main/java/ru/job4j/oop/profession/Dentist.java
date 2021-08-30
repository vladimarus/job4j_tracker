package ru.job4j.oop.profession;

public class Dentist extends Doctor {
    private final Person nurse;

    public Dentist(String name, String surename, String education, String birthday, String location, Person nurse) {
        super(name, surename, education, birthday, location);
        this.nurse = nurse;
    }

    public void doCleaning(Patient patient) {
    }

    public void doImplantation(Patient patient) {
    }

    public void removeTooth(Patient patient) {
    }
}
