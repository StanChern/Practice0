package ru.ssau.tk.goga.Practice0;

public class MainClass {

    public static void main(String[] args) {

        Point firstPoint = new Point(1,1,1);
        Point secondPoint = new Point(0,0,0);
        Point thirdPoint = new Point(3,4,5);

        Point resultPoint1 = Points.enlarge(thirdPoint, 6);

        System.out.println("enlarge:" + resultPoint1.x + ' '+ resultPoint1.y + ' ' + resultPoint1.z);
    }
}
