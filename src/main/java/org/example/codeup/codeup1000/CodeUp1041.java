package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1041 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int asciiNumOfInput = scn.nextLine().charAt(0);

        asciiNumOfInput += 1;

        System.out.printf("%c", asciiNumOfInput);
    }
}
