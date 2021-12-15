package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String prefix1 = o1.split("/")[0];
        String prefix2 = o2.split("/")[0];
        int compare = prefix2.compareTo(prefix1);
        return compare == 0 ? o1.compareTo(o2) : compare;
    }
}
