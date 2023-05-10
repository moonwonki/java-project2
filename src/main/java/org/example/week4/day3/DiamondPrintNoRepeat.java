package org.example.week4.day3;

import java.util.Scanner;

public class DiamondPrintNoRepeat {
    public static String getForLoopSymbol(String symbol, int n){
        String result = "";

        for (int i = 0; i < n; i++) result = result.concat(symbol);

        return result;
    }

    public static void main(String[] args) {
        // critical logic : pivot!
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();
        int pivot = numInput / 2;
        for (int row = 0; row < numInput; row++){
            // 피라미드
            if (row <= pivot){
                System.out.printf("%s%s\n", getForLoopSymbol(" ", numInput / 2 - row), getForLoopSymbol("*", 2 * row + 1));
            }
            //역 피라미드
            else {
                System.out.printf("%s%s\n", getForLoopSymbol(" ", row - pivot), getForLoopSymbol("*", 2 * (numInput - row) - 1));
            }
        }
    }
}
