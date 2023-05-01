package org.example.codeup.codeup1000;

import java.util.Scanner;

public class CodeUp1067 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numInput = scn.nextInt();

        if (numInput < 0){
            System.out.println("minus");
        }
        else {
            System.out.println("plus");
        }


        if (numInput % 2 == 0){
            System.out.println("even");
        }
        else System.out.println("odd");
    }

}
