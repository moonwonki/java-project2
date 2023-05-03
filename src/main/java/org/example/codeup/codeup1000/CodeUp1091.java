package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int startNum = scn.nextInt();
        int multNum = scn.nextInt();
        int addNum = scn.nextInt();
        int idxNum = scn.nextInt();

        long sum = (long)startNum;
        for (int i = 1; i < idxNum; i++){
            sum = sum * multNum + addNum;
        }

        System.out.println(sum);
    }
}
