package org.example.week4.day2;

import java.util.Scanner;

public class ReversePyramid {
    private static String spaceChar = "0";

    //Generator
    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    //method
    private static void printPyramid(int height) {
        for (int row = 0; row < height; row++){
            //empty space
            System.out.printf(spaceChar.repeat(row));
            //star
            for (int i = 0; i < height - 2 * row; i++) System.out.printf("*");

            System.out.printf("\n");
        }
    }


    //main
    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        Scanner scn = new Scanner(System.in);
        int numInput = scn.nextInt();
        reversePyramid.printPyramid(numInput);
    }


}
