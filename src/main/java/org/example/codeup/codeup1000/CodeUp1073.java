package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1073 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int inputNum;
        while (true) {
            inputNum = scn.nextInt();

            if (inputNum != 0) System.out.println(inputNum);
            else break;
        }
    }
}
