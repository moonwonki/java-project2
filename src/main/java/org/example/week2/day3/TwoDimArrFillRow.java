package org.example.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void main(String[] args) {
        int intTwoDimArr[][] = new int[5][5];

        intTwoDimArr[2][0] = 1;
        intTwoDimArr[2][1] = 1;
        intTwoDimArr[2][2] = 1;
        intTwoDimArr[2][3] = 1;
        intTwoDimArr[2][4] = 1;


        for (int i = 0; i < intTwoDimArr.length; i++) {
            System.out.println(Arrays.toString(intTwoDimArr[i]));
        }
    }
}
