package ru.ssau.tk.goga.Practice0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {

    private static final double DELTA = 0.0001;

    @Test
    public void testLength() {
        Point lengthPoint1 = new Point(3, 4, 5);
        assertEquals(lengthPoint1.length(lengthPoint1), 7.07106, DELTA);

        Point lengthPoint2 = new Point(-12, 0, 16);
        assertEquals(lengthPoint2.length(lengthPoint2), 20, DELTA);
    }
}