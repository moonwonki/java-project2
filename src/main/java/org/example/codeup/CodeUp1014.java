package org.example.codeup;

import java.util.Scanner;

public class CodeUp1014 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char val1, val2;
        String stringInput = scn.nextLine();

        val1 = stringInput.charAt(0);
        val2 = stringInput.charAt(2);

        System.out.printf("%c %c", val2, val1);
    }
}
