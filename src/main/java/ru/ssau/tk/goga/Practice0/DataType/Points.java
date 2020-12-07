package ru.ssau.tk.goga.Practice0.DataType;

public class Points {

    private static final double DELTA = 0.00001;

    public static Point sum(Point p1, Point p2) {
        return new Point(p1.x + p2.x, p1.y + p2.y, p1.z + p2.z);
    }

    public static Point subtract(Point p1, Point p2) {
        return new Point(p1.x - p2.x, p1.y - p2.y, p1.z - p2.z);
    }

    public static Point multiply(Point p1, Point p2) {
        return new Point(p1.x * p2.x, p1.y * p2.y, p1.z * p2.z);
    }

    public static Point divide(Point p1, Point p2) {
        return new Point(p1.x / p2.x, p1.y / p2.y, p1.z / p2.z);
    }

    public static Point enlarge(Point p1, double x) {
        return new Point(p1.x * x, p1.y * x, p1.z * x);
    }

    public static double length(Point p) {
        return (p.length(p));
    }

    public static Point opposite(Point p) {
        return new Point(-p.x, -p.y, -p.z);
    }

    public static Point inverse(Point p) {
        return new Point(1 / p.x, 1 / p.y, 1 / p.z);
    }

    public static double scalarProduct(Point p1, Point p2) {
        return (p1.x * p2.x + p1.y * p2.y + p1.z * p2.z);
    }

    public static Point vectorProduct(Point p1, Point p2) {
        return new Point(p1.y * p2.z - p2.y * p1.z, -(p1.x * p2.z - p2.x * p1.z), p1.x * p2.y - p2.x * p1.y);
    }

    public static boolean equalsApproximately(double a, double b) {
        return Math.abs(a - b) < DELTA;
    }

    public static boolean equalsApproximately(Point a, Point b) {
        return equalsApproximately(a.x, b.x) & equalsApproximately(a.y, b.y) & equalsApproximately(a.y, b.y);
    }
}
