package org.example.codeup;

import java.util.Scanner;

public class CodeUp1048 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int originInput = scn.nextInt();
        int expInput = scn.nextInt();

        System.out.printf("%d\n", originInput << expInput);
    }
}
