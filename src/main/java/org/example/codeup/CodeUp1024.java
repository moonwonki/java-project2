package org.example.codeup;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String inputString = scn.nextLine();

        for (int i = 0; i < inputString.length(); i++){
            System.out.printf("\'%s\'\n", inputString.charAt(i));
        }
    }
}
