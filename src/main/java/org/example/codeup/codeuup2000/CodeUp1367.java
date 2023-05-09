package org.example.codeup.codeuup2000;

import java.util.Scanner;

public class CodeUp1367 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        for (int dan = 1; dan <= numInput; dan++){
            for (int space = 0; space < numInput - dan; space++){
                System.out.printf(" ");
            }

            for (int i = 0; i < numInput; i++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
