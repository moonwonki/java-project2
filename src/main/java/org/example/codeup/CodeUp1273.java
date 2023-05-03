package org.example.codeup;

import java.util.Scanner;

public class CodeUp1273 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        for (int i = 1; i <= numInput; i++){
            if (numInput % i == 0) {
                System.out.println(i);
            }
        }
    }
}
