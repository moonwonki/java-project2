package org.example.week1.day5;

public class PointTest {


    public static void main(String[] args) {
        Point firstPoint = new Point();
        firstPoint.xVal = 0;
        firstPoint.yVal = 0;

        System.out.printf("Does X and Y have same value? %s\n ", firstPoint.isSameXy());
        System.out.printf("x:%d, y:%d\n", firstPoint.xVal, firstPoint.yVal);

        Point secondPoint = new Point();
        secondPoint.xVal = 1;
        secondPoint.yVal = 1;

        System.out.printf("Does X and Y have same value? %s\n ", secondPoint.isSameXy());
        System.out.printf("x:%d, y:%d\n", secondPoint.xVal, secondPoint.yVal);

        Point thirdPoint = new Point();
        thirdPoint.xVal = 2;
        thirdPoint.yVal = 3;

        System.out.printf("Does X and Y have same value? %s\n ", thirdPoint.isSameXy());
        System.out.printf("x:%d, y:%d\n", thirdPoint.xVal, thirdPoint.yVal);
    }
}
