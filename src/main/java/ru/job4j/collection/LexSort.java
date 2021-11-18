package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String split = left.split("\\.")[0];
        int lefti =  Integer.parseInt(split);
        split = right.split("\\.")[0];
        int righti = Integer.parseInt(split);
        return Integer.compare(lefti, righti);
    }
}
