package ru.job4j.oop.profession;

public class Builder extends Engineer {
    private Project project;

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
