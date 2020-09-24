package ru.ssau.tk.goga.Practice0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {

    private static final double DELTA = 0.0001;
    Point firstPoint = new Point(-8, 0, 5);
    Point secondPoint = new Point(18, -4, -6);
    double number = -3;

    @Test
    public void testSum() {
        Point sumPoint = Points.sum(firstPoint, secondPoint);
        assertEquals(sumPoint.x, 10, DELTA);
        assertEquals(sumPoint.y, -4, DELTA);
        assertEquals(sumPoint.z, -1, DELTA);
    }

    @Test
    public void testSubtract() {
        Point subtractPoint = Points.subtract(firstPoint, secondPoint);
        assertEquals(subtractPoint.x, -26, DELTA);
        assertEquals(subtractPoint.y, 4, DELTA);
        assertEquals(subtractPoint.z, 11, DELTA);
    }

    @Test
    public void testMultiply() {
        Point multiplyPoint = Points.multiply(firstPoint, secondPoint);
        assertEquals(multiplyPoint.x, -144, DELTA);
        assertEquals(multiplyPoint.y, 0, DELTA);
        assertEquals(multiplyPoint.z, -30, DELTA);
    }

    @Test
    public void testDivide() {
        Point dividePoint = Points.divide(firstPoint, secondPoint);
        assertEquals(dividePoint.x, -0.44444, DELTA);
        assertEquals(dividePoint.y, 0, DELTA);
        assertEquals(dividePoint.z, -0.83333, DELTA);
    }

    @Test
    public void testEnlarge() {
        Point enlargePoint = Points.enlarge(firstPoint, number);
        assertEquals(enlargePoint.x, 24, DELTA);
        assertEquals(enlargePoint.y, 0, DELTA);
        assertEquals(enlargePoint.z, -15, DELTA);
    }
}