package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1052 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int aInput = scn.nextInt();
        int bInput = scn.nextInt();

        System.out.println(aInput != bInput ? 1 : 0);
    }
}
