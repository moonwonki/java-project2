package org.example.codeup;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String stringInput = scn.nextLine();

        String[] stringSplitByPoint = stringInput.split("\\.");

        System.out.println(stringSplitByPoint[0]);
        System.out.println(stringSplitByPoint[1]);
    }
}
