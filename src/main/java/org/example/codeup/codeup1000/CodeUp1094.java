package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1094 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int totalCall = scn.nextInt();

        int studentNumbers[] = new int[totalCall];

        for (int i = 0; i < totalCall; i++){
            studentNumbers[i] = scn.nextInt();
        }

        for (int i = totalCall - 1; i >= 0; i--){
            System.out.printf("%d ", studentNumbers[i]);
        }
    }
}
