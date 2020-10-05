package ru.ssau.tk.goga.Practice0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {

    private static final double DELTA = 0.00001;
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

    @Test
    public void testLength() {
        double lengthFirstPoint = Points.length(firstPoint);
        double lengthSecondPoint = Points.length(secondPoint);
        assertEquals(lengthFirstPoint, 9.43398, DELTA);
        assertEquals(lengthSecondPoint, 19.39072, DELTA);
    }

    @Test
    public void testOpposite() {
        Point oppositePoint = Points.opposite(firstPoint);
        assertEquals(oppositePoint.x, 8, DELTA);
        assertEquals(oppositePoint.y, 0, DELTA);
        assertEquals(oppositePoint.z, -5, DELTA);
    }

    @Test
    public void testInverse() {
        Point inversePoint = Points.inverse(secondPoint);
        assertEquals(inversePoint.x, 0.05555, DELTA);
        assertEquals(inversePoint.y, -0.25, DELTA);
        assertEquals(inversePoint.z, -0.16666, DELTA);
    }

    @Test
    public void testScalarProduct() {
        double scalarPoint = Points.scalarProduct(firstPoint, secondPoint);
        assertEquals(scalarPoint, -174, DELTA);
    }

    @Test
    public void testVectorProduct() {
        Point vectorPoint = Points.vectorProduct(firstPoint, secondPoint);
        assertEquals(vectorPoint.x, 20, DELTA);
        assertEquals(vectorPoint.y, 42, DELTA);
        assertEquals(vectorPoint.z, 32, DELTA);
    }
}
