package org.example.week4.day2;

import java.util.Scanner;

public class ReversePyramid {
    private  String spaceChar = "0";

    //Generator
    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    //method
    private void printPyramid(int height) {
        for (int row = 0; row < height / 2 + 1; row++){
            System.out.printf("%s",makeALine(height, row));
        }
    }

    private String makeALine(int height, int row) {
        return String.format("%s%s\n", spaceChar.repeat(row), "*".repeat(height - 2 * row));
    }


    //main
    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        Scanner scn = new Scanner(System.in);
        int numInput = scn.nextInt();
        reversePyramid.printPyramid(numInput);
    }


}
