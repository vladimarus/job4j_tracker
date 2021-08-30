package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] itemsWithNoNull = new Item[size];
        int notNullCount = 0;
        for (int index = 0; index < size; index++) {
            if (items[index] != null) {
                itemsWithNoNull[notNullCount] = items[index];
                notNullCount++;
            }
        }
        itemsWithNoNull = Arrays.copyOf(itemsWithNoNull, notNullCount);
        return itemsWithNoNull;
    }

    public Item[] findByName(String key) {
        Item[] filledItems = findAll();
        Item[] sameNamed = new Item[filledItems.length];
        int sameNamedCount = 0;
        for (Item item : filledItems) {
            if (item.getName().equals(key)) {
                sameNamed[sameNamedCount] = item;
                sameNamedCount++;
            }
        }
        sameNamed = Arrays.copyOf(sameNamed, sameNamedCount);
        return sameNamed;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}