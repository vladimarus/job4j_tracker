package ru.job4j.oop.profession;

public class Engineer extends Profession {
    private final String industry;

    public Engineer(String name, String surename, String education, String birthday, String industry) {
        super(name, surename, education, birthday);
        this.industry = industry;
    }

    public String getIndustry() {
        return industry;
    }

    public void makePlan(Project project) {
    }

    public void discussSolution(Project project, Engineer[] team) {
    }
}
