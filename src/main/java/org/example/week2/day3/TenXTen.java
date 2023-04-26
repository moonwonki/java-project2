package org.example.week2.day3;

import java.util.Arrays;

public class TenXTen {
    public static void main(String[] args) {

        int[][] arr10x10 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr10x10[i]));
        }


        int[][] arr3x3 = new int[3][3];
        arr3x3[0][1] = 1;

    }
}
