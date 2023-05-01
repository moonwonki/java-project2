package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1070 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int month = scn.nextInt();

        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fall");
                break;
            default:
                System.out.println("No such month");
        }
    }
}
