package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1055 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int firstInput = scn.nextInt();
        int secondInput = scn.nextInt();

        System.out.println(firstInput == 1 || secondInput == 1 ? 1 : 0);
    }
}
