package org.example.week4.day3;

import java.util.Scanner;

public class DiamondPrintALine {

    public static void main(String[] args) {
        // critical logic : pivot!
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        for (int row = 0; row < numInput; row++){
            System.out.printf(makeALine(numInput, row));
        }
    }

    public static String makeALine(int numInput, int row){
        int pivot = numInput / 2;
        if (row <= pivot){
            return String.format("%s%s\n", getRepeatedSymbol(" ", numInput / 2 - row), getRepeatedSymbol("*", 2 * row + 1));
        }
        //역 피라미드
        else {
            return String.format("%s%s\n", getRepeatedSymbol(" ", row - pivot), getRepeatedSymbol("*", 2 * (numInput - row) - 1));
        }
    }

    public static String getRepeatedSymbol(String symbol, int n){
        return symbol.repeat(n);
    }
}
