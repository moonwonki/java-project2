package org.example.codeup;

import java.util.Scanner;

public class CodeUp1274 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        if (numInput == 1){
            System.out.println("not prime");
            return;
        }
        for (int i = 2; i < numInput; i++){
            if (numInput % i == 0) {
                System.out.println("not prime");
                return;
            }
        }

        System.out.println("prime");

    }
}
