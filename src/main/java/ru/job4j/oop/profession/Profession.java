package ru.job4j.oop.profession;

public class Profession {
    private final String name;
    private final String surename;
    private final String education;
    private final String birthday;

    public Profession(String name, String surename, String education, String birthday) {
        this.name = name;
        this.surename = surename;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }
}
