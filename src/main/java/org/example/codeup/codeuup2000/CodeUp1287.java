package org.example.codeup.codeuup2000;

import java.util.Scanner;

public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        for (int dan = 1; dan < 10; dan++){
            for (int mult = 1; mult <= dan; mult++){
                for (int i = 0; i < numInput; i++){
                    System.out.printf("*");
                }
            }
            System.out.printf("\n");
        }
    }
}
