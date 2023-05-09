package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1098OOP {
    int[][] map;

    public CodeUp1098OOP(int rowCnt, int colCnt){
        this.map = new int[rowCnt][colCnt];
    }

    public void setStick(int length, int dir, int posX, int posY){
        if (dir == 0){
            for (int x = posX; x < posX + length; x++){
                map[posY][x] = 1;
            }
        }
        else {
            for (int y = posY; y < posY + length; y++){
                map[y][posX] = 1;
            }
        }
    }


    public void printMap() {
        for (int y = 0; y < map.length; y++){
            for (int x = 0; x < map[y].length; x++){
                System.out.printf("%d ", map[y][x]);
            }
            System.out.printf("\n");
        }
    }


    //static main
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int mapHeight = scn.nextInt();
        int mapWidth = scn.nextInt();
        int stickNum = scn.nextInt();

        //build map
        CodeUp1098OOP c1098 = new CodeUp1098OOP(mapHeight, mapWidth);


        //get Input and set stick
        for (int i = 0; i < stickNum; i++){
            int stickLen = scn.nextInt();
            int stickDir = scn.nextInt();
            int posY = scn.nextInt() - 1;
            int posX = scn.nextInt() - 1;

            c1098.setStick(stickLen, stickDir, posX, posY);
        }


        c1098.printMap();

    }

}
