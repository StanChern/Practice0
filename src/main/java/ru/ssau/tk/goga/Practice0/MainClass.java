package ru.ssau.tk.goga.Practice0;

public class MainClass {

    public static void main(String[] args) {

        Point firstPoint = new Point(1,1,1);
        Point secondPoint = new Point(0,0,0);
        Point thirdPoint = new Point(3,4,5);

        Point resultPoint1 = Points.sum(firstPoint, thirdPoint);
        Point resultPoint2 = Points.subtract(firstPoint, thirdPoint);
        Point resultPoint3 = Points.multiply(firstPoint, thirdPoint);
        Point resultPoint4 = Points.divide(firstPoint, thirdPoint);

        System.out.println("sum:\t\t" + resultPoint1.x + ' '+ resultPoint1.y + ' ' + resultPoint1.z);
        System.out.println("subtract:\t" + resultPoint2.x + ' '+ resultPoint2.y + ' ' + resultPoint2.z);
        System.out.println("multiply:\t" + resultPoint3.x + ' '+ resultPoint3.y + ' ' + resultPoint3.z);
        System.out.println("divide:\t\t" + resultPoint4.x + ' '+ resultPoint4.y + ' ' + resultPoint4.z);
    }
}
