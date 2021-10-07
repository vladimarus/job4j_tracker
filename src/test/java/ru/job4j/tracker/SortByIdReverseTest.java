package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortByIdReverseTest {

    @Test
    public void whenSortByIdReverse() {
        Item first = new Item(0, "First");
        Item second = new Item(1, "Second");
        List<Item> items = Arrays.asList(
                first,
                second);
        List<Item> expected = Arrays.asList(
                second,
                first);
        Collections.sort(items, new SortByIdReverse());
        assertThat(items, is(expected));
    }
}
