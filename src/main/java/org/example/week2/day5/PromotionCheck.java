package org.example.week2.day5;

import java.util.Scanner;

public class PromotionCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int workedSince = scn.nextInt();
        int projectNum = scn.nextInt();

        if (workedSince > 5 || projectNum > 10){
            System.out.println("Promotion!");
        }
        else {
            System.out.println("No Promotion!");
        }
    }
}
