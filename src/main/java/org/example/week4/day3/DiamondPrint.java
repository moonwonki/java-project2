package org.example.week4.day3;

import java.util.Scanner;

public class DiamondPrint {
    public static String getRepeatedSymbol(String symbol, int n){
        return symbol.repeat(n);
    }
    public static void main(String[] args) {
        // critical logic : pivot!
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();
        int pivot = numInput / 2;
        for (int row = 0; row < numInput; row++){
            // 피라미드
            if (row <= pivot){
                System.out.printf("%s%s\n", getRepeatedSymbol(" ", numInput / 2 - row), getRepeatedSymbol("*", 2 * row + 1));
            }
            //역 피라미드
            else {
                System.out.printf("%s%s\n", getRepeatedSymbol(" ", row - pivot), getRepeatedSymbol("*", 2 * (numInput - row) - 1));
            }
        }
    }
}
