package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int res = 0;
        for (int index = 0; index < Math.min(left.length(), right.length()); index++) {
            if (left.charAt(index) > right.charAt(index)) {
                res = 1;
                break;
            } else if (left.charAt(index) < right.charAt(index)) {
                res = -1;
                break;
            }
        }
        if (res == 0) {
            res = left.length() - right.length();
        }
        return res;
    }
}
