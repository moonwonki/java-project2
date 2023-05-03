package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int totalCall = scn.nextInt();

        int studentNumbers[] = new int[24];

        for (int i = 0; i < totalCall; i++){
            studentNumbers[scn.nextInt()]++;
        }

        for (int i = 1; i <= 23; i++){
            System.out.printf("%d ", studentNumbers[i]);
        }
    }
}
