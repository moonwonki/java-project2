package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String inputString = scn.nextLine();

        String[] splitInputString = inputString.split("\\.");

        System.out.printf("%s-%s-%s", splitInputString[2], splitInputString[1], splitInputString[0]);
    }
}
