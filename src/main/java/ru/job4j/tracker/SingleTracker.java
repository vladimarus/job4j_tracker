package ru.job4j.tracker;

import java.util.List;

public final class SingleTracker {
    private static Tracker instance = null;

    private SingleTracker() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return instance.add(item);
    }

    public List<Item> findAll() {
        return instance.findAll();
    }

    public List<Item> findByName(String key) {
        return instance.findByName(key);
    }

    public Item findById(int id) {
        return instance.findById(id);
    }

    public boolean replace(int id, Item item) {
        return instance.replace(id, item);
    }

    public boolean delete(int id) {
        return instance.delete(id);
    }
}
