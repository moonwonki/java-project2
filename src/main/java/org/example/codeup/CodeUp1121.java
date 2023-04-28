package org.example.codeup;

import java.util.Scanner;

public class CodeUp1121 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int firstNum = scn.nextInt();
        int secondNum = scn.nextInt();


        System.out.printf("%d\n", firstNum % secondNum);
    }
}
