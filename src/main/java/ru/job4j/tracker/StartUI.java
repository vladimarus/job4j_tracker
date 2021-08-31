package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime created = item.getCreated();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String createdDTF = created.format(dateTimeFormatter);
        System.out.println(createdDTF);
        System.out.println();
        Item itemOut = new Item(11, "Cobalt");
        System.out.println(itemOut);
    }
}
