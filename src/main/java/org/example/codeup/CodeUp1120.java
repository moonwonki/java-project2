package org.example.codeup;

import java.util.Scanner;

public class CodeUp1120 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int firstNum = scn.nextInt();
        int secondNum = scn.nextInt();
        int thirdNum = scn.nextInt();

        System.out.printf("%.2f\n", (float)(firstNum + secondNum + thirdNum) / 3);
    }
}
