package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int inputNum = scn.nextInt();

        int sum = 0;
        for (int i = 0; i <= inputNum; i+=2){
            sum += i;
        }
        System.out.println(sum);
    }
}
