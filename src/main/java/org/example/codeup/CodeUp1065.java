package org.example.codeup;

import java.util.Scanner;

public class CodeUp1065 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int aInput = scn.nextInt();
        int bInput = scn.nextInt();
        int cInput = scn.nextInt();

        if (aInput % 2 == 0) System.out.println(aInput);
        if (bInput % 2 == 0) System.out.println(bInput);
        if (cInput % 2 == 0) System.out.println(cInput);
    }
}
