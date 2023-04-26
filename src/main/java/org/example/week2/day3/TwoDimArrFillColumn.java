package org.example.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillColumn {
    public static void main(String[] args) {
        int[][] intTwoDimArr = new int[5][5];
        intTwoDimArr[0][2] = 1;
        intTwoDimArr[1][2] = 1;
        intTwoDimArr[2][2] = 1;
        intTwoDimArr[3][2] = 1;
        intTwoDimArr[4][2] = 1;
        for (int i = 0; i < intTwoDimArr.length; i++) {
            System.out.println(Arrays.toString(intTwoDimArr[i]));
        }

    }
}
