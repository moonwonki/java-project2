package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int nInput = scn.nextInt();

        int sum = 0;
        for (int i = 1; i <= nInput; i++){
            sum += i;
            if (sum >= nInput) {
                System.out.println(i);
                break;
            }
        }


    }
}
