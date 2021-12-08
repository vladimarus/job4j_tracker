package ru.job4j.oop.profession;

public class Programmer extends Engineer {
    private final String task;

    public Programmer(String name, String surename, String education, String birthday,
                      String industry, String task) {
        super(name, surename, education, birthday, industry);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String newTask) {
    }

    public void writeCode(Project project) {
    }

    public void testCode(Project project) {
    }
}
