package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int inputChar = scn.nextLine().charAt(0);

        for (int i = 97; i <= inputChar ; i++){
            System.out.printf("%c ",i);
        }
    }
}
