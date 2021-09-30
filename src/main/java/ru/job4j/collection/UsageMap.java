package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> kv = new HashMap<>();
        kv.put("email@ya.ru", "Ivanov I.I.");
        kv.put("email@ya.kz", "Vasilyev V.V.");
        for (String key : kv.keySet()) {
            String value = kv.get(key);
            System.out.println(key + " - " + value);
        }
    }
}
