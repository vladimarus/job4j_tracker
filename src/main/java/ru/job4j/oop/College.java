package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        // повышение типа
        Student student = freshman;
        // повышение типа
        Object obj = student;
        // повышение типа
        obj = freshman;
        // понижение типа
        student = (Student) obj;
        // понижение типа
        freshman = (Freshman) student;
    }
}
