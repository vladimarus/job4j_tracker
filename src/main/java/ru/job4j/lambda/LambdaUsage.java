package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Пример применения многострочного лямбда-блока
 * Лямбдой реализован компаратор. Объеты Attachment сортируются по длине
 * имени, в обратном порядке (по убыванию).
 */
public class LambdaUsage {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 1.3.1", 120),
                new Attachment("image 1.2", 23)
        };

        Comparator<Attachment> cmpDescSize = (left, right) -> {
            int res = Integer.compare(
                    right.getName().length(),
                    left.getName().length());
            System.out.println(left.getName().length() + " < "
                    + right.getName().length() + ": "
                    + (res < 0));
            return res;
        };

        Arrays.sort(atts, cmpDescSize);
        System.out.println(Arrays.toString(atts));
    }
}

