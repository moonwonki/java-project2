package org.example.codeup;

import java.util.Scanner;

public class CodeUp1037 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int integerInput = scn.nextInt();

        char asciiToChar = (char)integerInput;

        System.out.printf("%c", asciiToChar);
    }
}
