package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SortByIdReverseTest {

    @Test
    public void whenSortByIdReverse() {
        Item first = new Item(0, "First");
        Item second = new Item(1, "Second");
        List<Item> items = new ArrayList<>(Arrays.asList(first, second));
        Collections.sort(items, new SortByIdReverse());
        assertTrue(items.get(1).compareTo(items.get(0)) < 0);
    }
}
