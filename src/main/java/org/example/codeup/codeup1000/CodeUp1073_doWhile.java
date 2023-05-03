package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1073_doWhile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numInput;
        do {
            numInput = scn.nextInt();
            if (numInput == 0) break;
            System.out.println(numInput);
        } while (numInput != 0);
    }
}
