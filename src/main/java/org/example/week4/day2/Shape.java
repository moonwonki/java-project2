package org.example.week4.day2;

import java.util.Scanner;

public class Shape {
    private  String spaceChar = "0";

    //Generator
    public Shape(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    //method
    public void printShape(int height, String type) {
        int limit = 0;
        if (type.equals("ReversePyramid")) limit = height / 2 + 1;
        else if (type.equals("Parallelogram")) limit = height;

        for (int row = 0; row < limit; row++){
            System.out.printf("%s",makeALine(height, row, type));
        }
    }

    private String makeALine(int height, int row, String type) {
        if (type.equals("ReversePyramid"))
            return String.format("%s%s\n", spaceChar.repeat(row), "*".repeat(height - 2 * row));
        else if (type.equals("Parallelogram"))
            return String.format("%s%s\n", spaceChar.repeat(height - 1 - row), "*".repeat(height));
        return " ";
    }


    //main
    public static void main(String[] args) {
        Shape shape = new Shape(" ");
        Scanner scn = new Scanner(System.in);
        int numInput = scn.nextInt();
        shape.printShape(numInput, "Parallelogram");
    }
}
