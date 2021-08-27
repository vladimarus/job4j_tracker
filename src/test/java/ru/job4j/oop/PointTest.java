package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance3dWhen50Then50() {
        int x1 = 1;
        int y1 = 2;
        int z1 = 0;
        int x2 = 4;
        int y2 = 6;
        int z2 = 0;
        Point p1 = new Point(x1, y1, z1);
        Point p2 = new Point(x2, y2, z2);
        double expected = 5.0;
        double actual = p1.distance3d(p2);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void distance3dWhen52Then52() {
        int x1 = 1;
        int y1 = 2;
        int z1 = 3;
        int x2 = 4;
        int y2 = 5;
        int z2 = 6;
        Point p1 = new Point(x1, y1, z1);
        Point p2 = new Point(x2, y2, z2);
        double expected = 5.196;
        double actual = p1.distance3d(p2);
        assertEquals(expected, actual, 0.001);
    }
}