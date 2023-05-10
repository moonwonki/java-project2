package org.example.week4.day3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiamondFileOutput {
    public static void main(String[] args) throws IOException{
        // critical logic : pivot!
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        for (int row = 0; row < numInput; row++){
            fileOutput(makeALine(numInput, row));
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

    public static void fileOutput(String data) throws IOException {
        FileWriter fw = new FileWriter("./src/main/java/org/example/week4/day3/diamond.txt", true);
        fw.write(data);
        fw.close();
    }

    public static void consoleOutput(String data) {
        System.out.printf("data");
    }
}





    /*
    public static String getRepeatedSymbol(String symbol, int n){
        return symbol.repeat(n);
    }
    public static void main(String[] args) throws IOException {
        // critical logic : pivot!
        Scanner scn = new Scanner(System.in);
        FileWriter fw = new FileWriter("./src/main/java/org/example/week4/day3/diamond.txt");

        int numInput = scn.nextInt();

        int pivot = numInput / 2;
        for (int row = 0; row < numInput; row++){
            // 피라미드
            if (row <= pivot){
                String data = String.format("%s%s\n", getRepeatedSymbol(" ", numInput / 2 - row), getRepeatedSymbol("*", 2 * row + 1));
                fw.write(data);
            }
            //역 피라미드
            else {
                String data = String.format("%s%s\n", getRepeatedSymbol(" ", row - pivot), getRepeatedSymbol("*", 2 * (numInput - row) - 1));
                fw.write(data);
            }
        }
        fw.close();
    }

     */

