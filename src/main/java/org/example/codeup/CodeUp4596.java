package org.example.codeup;

import java.util.Scanner;

public class CodeUp4596 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int map[][] = new int[9][9];

        int maxVal = Integer.MIN_VALUE;
        int maxY = 0;
        int maxX = 0;
        for (int y = 0; y < 9; y++){
            for (int x = 0; x < 9; x++){
                map[y][x] = scn.nextInt();
                if (map[y][x] > maxVal) {
                    maxY = y;
                    maxX = x;
                    maxVal = map[y][x];
                }
            }
        }

        System.out.println(maxVal);
        System.out.printf("%d %d\n", maxY + 1, maxX + 1);



    }
}
