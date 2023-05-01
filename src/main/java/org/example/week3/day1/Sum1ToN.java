package org.example.week3.day1;

import java.util.Scanner;

public class Sum1ToN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int nInput = scn.nextInt();

        int sum = 0;
        for (int i = 1; i <= nInput; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
