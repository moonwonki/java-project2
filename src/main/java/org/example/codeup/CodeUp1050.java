package org.example.codeup;

import java.util.Scanner;

public class CodeUp1050 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int aInput = scn.nextInt();
        int bInput = scn.nextInt();

        if (aInput == bInput) System.out.println("1");
        else System.out.println("0");
    }
}
