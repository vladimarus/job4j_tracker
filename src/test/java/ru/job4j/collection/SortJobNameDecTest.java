package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortJobNameDecTest {

    @Test
    public void whenSortByNameDecrease() {
        Job task1 = new Job("alpha", 1);
        Job task2 = new Job("beta", 2);
        List<Job> tasks = new ArrayList<>(Arrays.asList(
                task1,
                task2));
        List<Job> expected = new ArrayList<>(Arrays.asList(
                task2,
                task1));
        Collections.sort(tasks, new SortJobNameDec());
        assertThat(tasks.get(0), is(expected.get(0)));
        assertThat(tasks.get(1), is(expected.get(1)));
    }
}
