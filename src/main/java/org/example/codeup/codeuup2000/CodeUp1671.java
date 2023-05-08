package org.example.codeup.codeuup2000;

import java.util.Scanner;

public class CodeUp1671 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int myRSP = scn.nextInt();
        int opRSP = scn.nextInt();

        playRSP(myRSP, opRSP);
    }

    private static void playRSP(int myRSP, int opRSP) {
        if (myRSP == opRSP) {
            System.out.println("tie");
            return;
        }

        if (myRSP == 1 && opRSP == 2){
            System.out.println("win");
        }
        else if (myRSP == 2 && opRSP == 0) {
            System.out.println("win");
        }
        else if (myRSP == 0 && opRSP == 1){
            System.out.println("win");
        }
        else {
            System.out.println("lose");
        }
    }
}
