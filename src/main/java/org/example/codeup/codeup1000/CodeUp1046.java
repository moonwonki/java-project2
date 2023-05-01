package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int firstNum = scn.nextInt();
        int secondNum = scn.nextInt();
        int thirdNum = scn.nextInt();

        System.out.printf("%d\n", firstNum + secondNum + thirdNum);
        System.out.printf("%.1f\n", ((float)firstNum + (float)secondNum + (float)thirdNum) / 3);
    }
}
