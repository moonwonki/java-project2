package org.example.week1.day5;

import org.example.PrintHello;

public class ConstantEx {
    public final int MAX_LEVEL = 3;
    public static final int ZERO_Val = 0;
    public static void main(String[] args) {
        final int iVal;
        iVal = 1;
        System.out.println("iVal = " + iVal);

        final PrintHello printHello = new PrintHello();
    }
}
