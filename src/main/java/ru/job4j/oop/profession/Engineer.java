package ru.job4j.oop.profession;

public class Engineer extends Profession {
    private String industry;
    private String position;
    private String location;

    public String getIndustry() {
        return industry;
    }

    public String getPosition() {
        return position;
    }

    public String getLocation() {
        return location;
    }

    public void makePlan(Project project) {
    }

    public void discussSolution(Project project, Engineer[] team) {
    }
}
