package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1034 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String stringInput = scn.nextLine();

        int octalInteger = Integer.parseInt(stringInput, 8);

        System.out.println(octalInteger);
    }
}
