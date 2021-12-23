package ru.job4j.lambda;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class FuncInDiapason {

    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> res = new LinkedList<>();
        for (double n = start; n < end; n++) {
            res.add(func.apply(n));
        }
        return res;
    }
}
