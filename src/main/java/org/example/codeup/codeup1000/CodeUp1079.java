package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String inputString = scn.nextLine();


        String[] splitString = inputString.split(" ");

        for (int i = 0; i < splitString.length; i++){
            System.out.println(splitString[i].charAt(0));
            if (splitString[i].charAt(0) == 'q') {
                break;
            }
        }
    }
}
