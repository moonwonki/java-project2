package org.example.week2.day1;

public class NarrowingCasting {
    public static void main(String[] args) {
        double dVal = 123.456;

        int iVal = (int) dVal;

        System.out.println("iVal = " + iVal);
        System.out.println("dVal = " + dVal);
    }
}
