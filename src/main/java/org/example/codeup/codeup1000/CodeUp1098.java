package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int mapHeight = scn.nextInt();
        int mapWidth = scn.nextInt();
        int stickNum = scn.nextInt();

        int map[][] = new int[mapHeight][mapWidth];

        for (int i = 0; i < stickNum; i++){
            int stickLen = scn.nextInt();
            int stickDir = scn.nextInt();
            int posY = scn.nextInt() - 1;
            int posX = scn.nextInt() - 1;

            if (stickDir == 0){
                for (int x = posX; x < posX + stickLen; x++){
                    map[posY][x] = 1;
                }
            }
            else {
                for (int y = posY; y < posY + stickLen; y++){
                    map[y][posX] = 1;
                }
            }
        }


        for (int y = 0; y < mapHeight; y++){
            for (int x = 0; x < mapWidth; x++){
                System.out.printf("%d ", map[y][x]);
            }
            System.out.println();
        }

    }

}
