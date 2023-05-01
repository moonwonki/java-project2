package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ssnInput = scn.nextLine();



        System.out.printf("%s%s",ssnInput.substring(0,6), ssnInput.substring(7));
    }
}
