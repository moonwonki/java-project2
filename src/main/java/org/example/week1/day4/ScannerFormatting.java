package org.example.week1.day4;

import java.util.Scanner;

public class ScannerFormatting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
}
