package org.example.week2.day3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrFillInputRow {
    public static void main(String[] args) {
        int twoDimArr[][] = new int[5][5];

        System.out.println("1. please type the index of row you want to fill in : ");
        Scanner scn = new Scanner(System.in);
        int fillRowInput = scn.nextInt();

        for (int i = 0; i < 5; i++){
            twoDimArr[fillRowInput][i] = 1;
        }

        for (int i = 0; i < twoDimArr.length; i++) {
            System.out.println(Arrays.toString(twoDimArr[i]));
        }
    }
}
