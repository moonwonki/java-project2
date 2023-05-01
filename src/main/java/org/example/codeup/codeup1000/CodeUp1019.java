package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        String stringInput[] = scn.nextLine().split("\\.");

        System.out.printf("%04d.%02d.%02d", Integer.parseInt(stringInput[0]), Integer.parseInt(stringInput[1]), Integer.parseInt(stringInput[2]));


    }
}
