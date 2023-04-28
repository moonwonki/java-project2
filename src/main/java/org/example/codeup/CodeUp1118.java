package org.example.codeup;

import java.util.Scanner;

public class CodeUp1118 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float firstNum = scn.nextFloat();
        float secondNum = scn.nextFloat();

        System.out.printf("%.1f\n", firstNum * secondNum / 2);
    }
}
