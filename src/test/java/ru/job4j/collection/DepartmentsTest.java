package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertEquals(expect, result);
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertEquals(expect, result);
    }

    @Test
    public void whenAscOrder() {
        List<String> input = Arrays.asList("k1/sk2", "k2/sk1", "k1/sk1", "k2");
        List<String> expect = Arrays.asList("k1/sk1", "k1/sk2", "k2", "k2/sk1");
        Departments.sortAsc(input);
        assertEquals(expect, input);
    }

    @Test
    public void whenDescOrder() {
        List<String> input = Arrays.asList("k1/sk2", "k2/sk1", "k1/sk1", "k2");
        List<String> expect = Arrays.asList("k2", "k2/sk1", "k1/sk1", "k1/sk2");
        Departments.sortDesc(input);
        assertEquals(expect, input);
    }
}
