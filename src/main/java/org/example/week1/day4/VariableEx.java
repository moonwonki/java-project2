package org.example.week1.day4;

import org.example.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int iVal;
        iVal = 0;


        PrintHello printHello;
        printHello= new PrintHello();

        System.out.println("iVal = " + iVal);
        printHello.print();
    }
}
