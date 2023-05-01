package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1081 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int firstDice = scn.nextInt();
        int secondDice = scn.nextInt();

        for (int f = 1; f <= firstDice; f++){
            for (int s = 1; s <= secondDice; s++){
                System.out.printf("%d %d\n", f, s);
            }
        }
    }
}
