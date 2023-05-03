package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int aInput = scn.nextInt();
        int bInput = scn.nextInt();
        int cInput = scn.nextInt();


        int day = 1;
        while (day % aInput != 0 || day % bInput != 0 || day % cInput != 0){
            day++;
        }

        System.out.println(day);
    }
}
