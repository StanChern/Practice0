package ru.ssau.tk.goga.Practice0;

public class Points {

    public Points(){

    }

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
}
