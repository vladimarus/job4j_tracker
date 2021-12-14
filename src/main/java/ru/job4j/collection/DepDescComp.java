package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String prefix1 = o1.split("/")[0];
        String prefix2 = o2.split("/")[0];
        int compare = prefix2.compareTo(prefix1);
        if (compare == 0) {
            int substrIdx1 = prefix1.length();
            int substrIdx2 = prefix2.length();
            return o1.substring(substrIdx1).compareTo(
                    o2.substring(substrIdx2));
        }
        return compare;
    }
}
