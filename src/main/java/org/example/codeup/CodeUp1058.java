package org.example.codeup;

import java.util.Scanner;

public class CodeUp1058 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int firstInput = scn.nextInt();
        int secondInput = scn.nextInt();

        if (firstInput == 0 && secondInput == 0) System.out.println("1");
        else System.out.println("0");
    }
}
