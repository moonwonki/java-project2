package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int field[][] = new int[19][19];

        int turn = scn.nextInt();

        for (int i = 0; i < turn; i++){
            field[scn.nextInt() - 1][scn.nextInt() - 1] = 1;
        }

        for (int y = 0; y < 19; y++){
            for (int x = 0; x < 19; x++){
                System.out.printf("%d ", field[y][x]);
            }
            System.out.println();
        }
    }
}
