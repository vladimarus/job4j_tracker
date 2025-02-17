package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item implements Comparable<Item> {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(
            "dd-MMMM-EEEE-yyyy HH:mm:ss");
    private int id;
    private String name;
    private final LocalDateTime created = LocalDateTime.now();

    public Item() {
    }

    public Item(String initName) {
        name = initName;
    }

    public Item(int initId, String initName) {
        id = initId;
        name = initName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Item{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", created=" + created.format(FORMATTER)
                + '}';
    }

    @Override
    public int compareTo(Item o) {
        return Integer.compare(id, o.id);
    }
}
