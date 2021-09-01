package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        String in = question.nextLine();
        int answer = new Random().nextInt(3);
        String out = "Может быть";
        if (answer == 0) {
            out = "Да";
        } else if (answer == 1) {
            out = "Нет";
        }
        System.out.println(out);
    }
}
