package org.example.codeup.codeuup2000;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numInput = scn.nextInt();

        for (int row = 0; row < numInput; row++) {
            for (int i = numInput - row - 1; i > 0; i--) {
                System.out.printf(" ");
            }
            for (int i = 0; i < 2 * row + 1; i++) {
                System.out.printf("%s", "*");
            }
            System.out.println();
        }

    }
}
