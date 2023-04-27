package org.example.codeup;

import java.util.Scanner;

public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int firstNum = scn.nextInt();
        int secondnum = scn.nextInt();
        int thirdNum = scn.nextInt();

        System.out.println(firstNum < secondnum ? (firstNum < thirdNum ? firstNum : thirdNum) : (secondnum < thirdNum ? secondnum : thirdNum));
    }
}
