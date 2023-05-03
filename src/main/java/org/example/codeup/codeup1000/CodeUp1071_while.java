package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1071_while {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while (true){
            int numInput = scn.nextInt();
            if (numInput == 0) break;
            System.out.println(numInput);
        }
    }
}
