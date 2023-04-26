package org.example.week2.day3;

import java.util.Arrays;

public class TwoDimArrEx {
    public static void main(String[] args) {
        int[][] arrInt = new int[3][3];

        printArr3x3(arrInt);


        arrInt[0][0] = 1;
        arrInt[0][2] = 2;
        arrInt[1][0] = 3;

        printArr3x3(arrInt);


        arrInt[1][1] = 5;
        printArr3x3(arrInt);
    }

    private static void printArr3x3(int[][] arrInt) {
        System.out.println(Arrays.toString(arrInt[0]));
        System.out.println(Arrays.toString(arrInt[1]));
        System.out.println(Arrays.toString(arrInt[2]));
        System.out.println("===============================================");
    }
}
