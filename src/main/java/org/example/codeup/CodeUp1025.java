package org.example.codeup;

import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String inputIntegerString = scn.nextLine();
        String zeroLinedUp = "00000";
        for (int i = 5; i >= 1; i--){

            System.out.printf("[%s%s]\n", inputIntegerString.charAt(5-i), zeroLinedUp.substring(6-i));
        }
    }
}
