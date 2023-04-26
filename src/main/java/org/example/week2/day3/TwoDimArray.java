package org.example.week2.day3;

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arrTwoDim = new int[3][3];
        int[] arr0 = arrTwoDim[0];
        arr0[0] = 1;

        System.out.println(Arrays.toString(arrTwoDim[0]));
        System.out.println(Arrays.toString(arrTwoDim[1]));
        System.out.println(Arrays.toString(arrTwoDim[2]));
    }
}
