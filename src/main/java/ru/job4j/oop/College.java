package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        Enrollee enrollee = student;
        student = (Student) enrollee;
    }
}
