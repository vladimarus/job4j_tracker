package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void whenSortById() {
        Item first = new Item(0, "First");
        Item second = new Item(1, "Second");
        List<Item> items = new ArrayList<>(Arrays.asList(second, first));
        Collections.sort(items);
        assertTrue(items.get(0).getId() < items.get(1).getId());
    }
}
