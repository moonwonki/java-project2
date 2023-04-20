package org.example.codeup;

import java.util.Scanner;

public class CodeUp1014 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char a, b;
        String s = scn.nextLine();

        a = s.charAt(0);
        b = s.charAt(2);

        System.out.printf("%c %c", b, a);
    }
}
