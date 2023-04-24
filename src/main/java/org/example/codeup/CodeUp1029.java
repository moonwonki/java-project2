package org.example.codeup;

import java.util.Scanner;

public class CodeUp1029 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String stringInput = scn.nextLine();
        String splitString[] = stringInput.split("\\.");

        for (int length = splitString[1].length() ; length < 11; length++){
            splitString[1] += "0";
        }

        System.out.printf("%s.%s",splitString[0],splitString[1]);

    }
}
