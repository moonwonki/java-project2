package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1072 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int loopInput = scn.nextInt();

        int tempInput;
        for (int loopVar = 0; loopVar < loopInput; loopVar++){
            tempInput = scn.nextInt();
            System.out.println(tempInput);
        }
    }
}
