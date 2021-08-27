package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Kiniaev Foma Petrovich");
        student.setGroupNumber(345);
        Date date = new Date();
        student.setEntryDate(date);
        System.out.println("Name: " + student.getName() + System.lineSeparator()
                + "Group number: " + student.getGroupNumber() + System.lineSeparator()
                + "Entry date: " + student.getEntryDate().toString());
    }
}
