package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int startNum = scn.nextInt();
        int diffNum = scn.nextInt();
        int idxNum = scn.nextInt();

        int sum = startNum;
        for (int i = 1; i < idxNum; i++){
            sum += diffNum;
        }

        System.out.println(sum);
    }
}
