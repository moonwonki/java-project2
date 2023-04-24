package org.example.codeup;

import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String stringInput = scn.nextLine();

        int hexInteger = Integer.parseInt(stringInput, 16);


        System.out.printf("%o", hexInteger);
    }
}
