package org.example.codeup.codeuup2000;

import java.util.Scanner;

public class CodeUp1358 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        int steps = (numInput + 1) / 2;
        int spaceInit = numInput / 2;
        for (int dan = 1; dan <= steps; dan++){
            //space
            for (int space = 0; space < spaceInit; space++) System.out.printf(" ");
            //stars
            for (int i = 0; i < dan * 2 - 1; i++) System.out.printf("*");
            //space
            for (int space = 0; space < spaceInit; space++) System.out.printf(" ");
            System.out.println();
            spaceInit--;
        }
    }
}
