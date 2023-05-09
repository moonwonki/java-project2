package org.example.week4.day2;

import java.util.Scanner;

public class Parallelogram{

    private  String spaceChar = "0";

    //Generator
    public Parallelogram(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    //method
    public void printShape(int height) {
        for (int row = 0; row < height; row++){
            System.out.printf("%s",makeALine(height, row));
        }
    }

    private String makeALine(int height, int row) {
        return String.format("%s%s\n", spaceChar.repeat(height - 1 - row), "*".repeat(height));
    }


    //main
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(" ");
        Scanner scn = new Scanner(System.in);
        int numInput = scn.nextInt();
        parallelogram.printShape(numInput);
    }
}
