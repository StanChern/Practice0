package ru.ssau.tk.goga.Practice0.DataType;

public class Point {

    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(Point p) {
        return (Math.sqrt(p.x * p.x + p.y * p.y + p.z * p.z));
    }

    public String toString() {
        return "[" + x + ", " + y + ", " + z + "]";
    }
}
