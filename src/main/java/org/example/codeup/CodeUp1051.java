package org.example.codeup;

import java.util.Scanner;

public class CodeUp1051 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int aInput = scn.nextInt();
        int bInput = scn.nextInt();

        if (bInput >= aInput) System.out.println("1");
        else System.out.println("0");
    }
}
