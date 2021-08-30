package ru.job4j.oop.profession;

public class Builder extends Engineer {
    private final Project project;

    public Builder(String name, String surename, String education, String birthday, String industry, Project project) {
        super(name, surename, education, birthday, industry);
        this.project = project;
    }

    public Project getProject() {
        return project;
    }

    public void provideMaterials(Project project) {
    }

    public void planWork(Project project) {
    }

    public boolean acceptWork(String task) {
        return true;
    }
}
