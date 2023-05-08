package org.example.week4.day1;

import java.util.Random;
import java.util.Scanner;

public class RSPtillWin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while(true){
            System.out.printf("Type Rock(0), Scissors(1), Paper(2) : ");
            int myRSP = scn.nextInt();
            System.out.println();

            Random random = new Random();
            random.setSeed(System.currentTimeMillis());
            int opRSP = random.nextInt(3);

            System.out.printf("You : %d <-> Opponent : %d\n", myRSP, opRSP);
            String result = playRSP(myRSP, opRSP);
            if (result.equals("win")) {
                System.out.println("You Win!");
                break;
            }
            else {
                System.out.println("one more round!");
                System.out.println("==================================\n");
            }
        }

    }


    //method
    private static String playRSP(int myRSP, int opRSP) {
        if (myRSP == opRSP) {
            return "tie";
        }

        if (myRSP == 1 && opRSP == 2){
            return "win";
        }
        else if (myRSP == 2 && opRSP == 0) {
            return "win";
        }
        else if (myRSP == 0 && opRSP == 1){
            return "win";
        }
        else {
            return "lose";
        }
    }
}
