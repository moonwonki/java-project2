package org.example.codeup;

import java.util.Scanner;

public class CodeUp1033 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int integerInput = scn.nextInt();

        String parsedToString = Integer.toHexString(integerInput);

        parsedToString = parsedToString.toUpperCase();

        System.out.printf("%s", parsedToString);
    }
}
