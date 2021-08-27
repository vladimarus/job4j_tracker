package ru.job4j.oop.profession;

public class Doctor extends Profession {
    private String specialization;
    private String position;
    private String location;

    public String getSpecialization() {
        return specialization;
    }

    public String getPosition() {
        return position;
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
