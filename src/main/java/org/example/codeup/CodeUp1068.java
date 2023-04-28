package org.example.codeup;

import java.util.Scanner;

public class CodeUp1068 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int scoreInput = scn.nextInt();

        if (scoreInput >= 90 && scoreInput <= 100) System.out.println("A");
        else if (scoreInput >= 70 && scoreInput < 90) System.out.println("B");
        else if (scoreInput >= 40 && scoreInput < 70) System.out.println("C");
        else System.out.println("D");
    }
}
