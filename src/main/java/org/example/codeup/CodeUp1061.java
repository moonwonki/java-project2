package org.example.codeup;

import java.util.Scanner;

public class CodeUp1061 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int firstInput = scn.nextInt();
        int secondInput = scn.nextInt();

        System.out.println(firstInput | secondInput);
    }
}