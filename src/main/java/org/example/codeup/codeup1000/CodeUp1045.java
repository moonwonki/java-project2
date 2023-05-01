package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int firstInput = scn.nextInt();
        int secondInput = scn.nextInt();

        System.out.printf("%d\n", firstInput + secondInput);
        System.out.printf("%d\n", firstInput - secondInput);
        System.out.printf("%d\n", firstInput * secondInput);
        System.out.printf("%d\n", firstInput / secondInput);
        System.out.printf("%d\n", firstInput % secondInput);

        System.out.printf("%.2f\n", (float)firstInput / (float)secondInput);
    }
}
