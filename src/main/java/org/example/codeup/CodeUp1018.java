package org.example.codeup;

import java.util.Scanner;

public class CodeUp1018 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String stringInput[] = scn.nextLine().split(":");

        int hour = Integer.parseInt(stringInput[0]);
        int minute = Integer.parseInt(stringInput[1]);

        System.out.printf("%d:%d", hour, minute);


    }
}
