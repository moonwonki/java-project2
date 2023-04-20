package org.example.week1.day4;

import java.util.Scanner;

public class ScannerFormatting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int val1 = scn.nextInt();
        int val2 = scn.nextInt();
        System.out.printf("%d + %d = %d", val1, val2, val1 + val2);
    }
}
