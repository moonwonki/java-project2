package org.example.codeup;

import java.util.Scanner;

public class CodeUp1083 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        for (int i = 1; i <= numInput; i++){
            if (i % 3 != 0){
                System.out.printf("%d ", i);
            }
            else {
                System.out.printf("X ");
            }
        }
    }
}
