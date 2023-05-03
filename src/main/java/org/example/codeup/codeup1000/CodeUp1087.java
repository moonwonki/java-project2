package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1087 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        int increaseVal = 1;
        int sum = 0;

        while (sum < numInput){
            sum += increaseVal++;
        }

        System.out.println(sum);
    }
}
