package org.example.week4.day3;


import java.io.IOException;
import java.util.Scanner;

public class DiamondShapeDrawer extends ShapeDrawer2 {
    public DiamondShapeDrawer(Printer2 printer) {
        super(printer);
    }

    public static void main(String[] args) throws IOException{
        // critical logic : pivot!
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        ShapeDrawer2 dsd = new DiamondShapeDrawer(new ConsolePrinter2());
        dsd.printShape(numInput);
    }

    public String makeALine(int numInput, int row){
        int pivot = numInput / 2;
        if (row <= pivot){
            return String.format("%s%s\n", getRepeatedSymbol(" ", numInput / 2 - row), getRepeatedSymbol("*", 2 * row + 1));
        }
        //역 피라미드
        else {
            return String.format("%s%s\n", getRepeatedSymbol(" ", row - pivot), getRepeatedSymbol("*", 2 * (numInput - row) - 1));
        }
    }

    public String getRepeatedSymbol(String symbol, int n){
        return symbol.repeat(n);
    }

    /*
    public static void fileOutput(String data) throws IOException {
        FileWriter fw = new FileWriter("./src/main/java/org/example/week4/day3/diamond.txt", true);
        fw.write(data);
        fw.close();
    }

    public static void consoleOutput(String data) {
        System.out.printf("data");
    }

     */
}

