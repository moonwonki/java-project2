package org.example.week1.day5;

public class DistanceBetweenPoint {
    public static void main(String[] args) {
        //Point setting
        Point firstPoint = new Point();
        firstPoint.xVal = 1;
        firstPoint.yVal = 1;

        Point secondPoint = new Point();
        secondPoint.xVal = 4;
        secondPoint.yVal = 5;

        //distance logic
        double distance = Math.pow(firstPoint.xVal - secondPoint.xVal, 2) + Math.pow(firstPoint.yVal - secondPoint.yVal, 2);
        distance = Math.sqrt(distance);

        System.out.println("distance = " + distance);
    }
}
