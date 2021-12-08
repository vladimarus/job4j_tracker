package ru.job4j.oop.profession;

public class Surgeon extends Doctor {
    private final Person assistant;

    public Surgeon(String name, String surename, String education, String birthday,
                   String location, Person assistant) {
        super(name, surename, education, birthday, location);
        this.assistant = assistant;
    }

    public void makeCut(Patient patient) {
    }

    public void sewWound(Patient patient) {
    }
}
