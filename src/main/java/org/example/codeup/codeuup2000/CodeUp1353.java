package org.example.codeup.codeuup2000;

import java.util.Scanner;

public class CodeUp1353 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        for (int dan = 0; dan < numInput; dan++){
            for (int i = 0; i <= dan; i++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
