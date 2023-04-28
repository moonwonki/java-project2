package org.example.codeup;

import java.util.Scanner;

public class CodeUp1124 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String moleculeString = scn.nextLine();

        int CIndex = 0;
        int HIndex = moleculeString.indexOf("H");

        int CNum = Integer.parseInt(moleculeString.substring(CIndex+1, HIndex));
        int HNum = Integer.parseInt(moleculeString.substring(HIndex + 1));

        System.out.printf("%d\n", CNum * 12 + HNum);
    }
}
