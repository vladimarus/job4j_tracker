package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FuncInDiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FuncInDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadFuncThenQuadResult() {
        List<Double> result = FuncInDiapason.diapason(3, 6, x -> 2 * x * x);
        List<Double> expected = Arrays.asList(18D, 32D, 50D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExpFuncThenExpResult() {
        List<Double> result = FuncInDiapason.diapason(3, 6, x -> Math.pow(4, x));
        List<Double> expected = Arrays.asList(64D, 256D, 1024D);
        assertThat(result, is(expected));
    }
}