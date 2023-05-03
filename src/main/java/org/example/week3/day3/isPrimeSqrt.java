package org.example.week3.day3;

import java.util.Scanner;

public class isPrimeSqrt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        if(numInput <= 1) {
            System.out.println("not prime");
        }

        for (int i = 2; i <= Math.sqrt(numInput); i++){
            if (numInput % i == 0) {
                System.out.println("not prime");
                return;
            }
        }

        System.out.println("prime");
    }
}
