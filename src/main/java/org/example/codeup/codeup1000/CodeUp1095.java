package org.example.codeup.codeup1000;


import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int totalCall = scn.nextInt();

        int studentNumbers[] = new int[totalCall];


        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < totalCall; i++){
            studentNumbers[i] = scn.nextInt();

            minNum = Math.min(minNum, studentNumbers[i]);
        }

        System.out.println(minNum);


    }
}
