package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        // повышающее приведение типа
        Enrollee enrollee = student;
        // понижающее приведение типа
        student = (Student) enrollee;
    }
}
