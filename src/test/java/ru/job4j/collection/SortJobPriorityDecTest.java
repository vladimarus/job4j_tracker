package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortJobPriorityDecTest {

    @Test
    public void whenSortByPriorityDecrease() {
        Job task1 = new Job("alpha", 1);
        Job task2 = new Job("beta", 2);
        List<Job> tasks = Arrays.asList(
                task1,
                task2);
        List<Job> expected = Arrays.asList(
                task2,
                task1);
        Collections.sort(tasks, new SortJobPriorityDec());
        assertThat(tasks, is(expected));
    }
}