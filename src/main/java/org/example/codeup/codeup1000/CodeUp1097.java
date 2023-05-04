package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        boolean map[][] = new boolean[19][19];

        for (int y = 0; y < 19; y++){
            for (int x = 0; x < 19; x++){
                int inputNum = scn.nextInt();
                if (inputNum == 1) map[y][x] = true;
                else map[y][x] = false;
            }
        }

        int flipNum = scn.nextInt();

        for (int i = 0; i < flipNum; i++){
            int flipY = scn.nextInt() - 1;
            int flipX = scn.nextInt() - 1;

            map = flipMap(map, flipY, flipX);
        }

        for (int y = 0; y < 19; y++){
            for (int x = 0; x < 19; x++){
                System.out.printf("%d ", map[y][x] ? 1 : 0);
            }
            System.out.println();
        }
    }


    public static boolean[][] flipMap(boolean map[][], int flipY, int flipX){
        for (int i = 0; i < 19; i++){
            map[flipY][i] = !map[flipY][i];
            map[i][flipX] = !map[i][flipX];
        }
        return map;
    }
}
