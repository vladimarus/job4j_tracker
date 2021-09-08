package ru.job4j.ex;

import org.junit.Test;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenArgLess0() {
        int arg = -1;
        new Fact().calc(arg);
    }

}