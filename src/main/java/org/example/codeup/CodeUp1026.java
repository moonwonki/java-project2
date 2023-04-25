package org.example.codeup;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String timeInput = scn.nextLine();
        String[] splitTime = timeInput.split(":");

        System.out.printf("%d",Integer.parseInt(splitTime[1]));
    }
}
