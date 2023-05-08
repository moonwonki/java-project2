package org.example.codeup.codeuup2000;

import java.util.Scanner;

public class CodeUp1361 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        for (int i = 0; i < numInput; i++){
            //space print
            for (int space = 0; space < i; space++){
                System.out.printf(" ");
            }
            System.out.printf("**\n");
        }
    }
}
