package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1099 {
    static int dx[] = {1, 0};
    static int dy[] = {0, 1};
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        int map[][] = new int[10][10];

        for (int y = 0; y < 10; y++){
            for (int x = 0; x < 10; x++){
                map[y][x] = scn.nextInt();
            }
        }

        int curX = 1;
        int curY = 1;
        boolean finished = false;
        while (!finished){
            //start point is the goal.
            if (map[curY][curX] == 2) {
                map[curY][curX] = 9;
                break;
            }

            //basic call
            map[curY][curX] = 9;
            for (int i = 0; i <= 1; i++){
                int ny = curY + dy[i];
                int nx = curX + dx[i];

                if (map[ny][nx] == 1 && i == 0) continue;
                else if (map[ny][nx] == 1 && i == 1) finished = true;
                else if (map[ny][nx] == 0) {
                    curX = nx;
                    curY = ny;
                    break;
                }
                else if (map[ny][nx] == 2) {
                    curX = nx;
                    curY = ny;
                    finished = true;
                    map[curY][curX] = 9;
                    break;
                }
            }
        }

        for (int y = 0; y < 10; y++){
            for (int x = 0; x < 10; x++){
                System.out.printf("%d ", map[y][x]);
            }
            System.out.println();
        }

    }
}
