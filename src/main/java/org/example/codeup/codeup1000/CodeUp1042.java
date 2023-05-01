package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1042 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int topInput = scn.nextInt();
        int bottomInput = scn.nextInt();

        System.out.printf("%d", topInput / bottomInput);
    }
}
