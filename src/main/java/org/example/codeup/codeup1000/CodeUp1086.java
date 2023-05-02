package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double w = scn.nextInt();
        double h = scn.nextInt();
        double b = scn.nextInt();

        double answer = (w * h * b) / 8 / 1024 / 1024;

        System.out.printf("%.2f MB",answer);
    }
}
