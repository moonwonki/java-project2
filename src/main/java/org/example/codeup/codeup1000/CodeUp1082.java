package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int inputNum = scn.nextInt(16);

        for(int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", inputNum, i, inputNum * i);
        }
    }
}
