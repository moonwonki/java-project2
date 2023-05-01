package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1071 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        for (int loopVar = 1; loopVar != 0;){
            loopVar = scn.nextInt();
            if (loopVar != 0) System.out.println(loopVar);
            else break;
        }
    }
}
