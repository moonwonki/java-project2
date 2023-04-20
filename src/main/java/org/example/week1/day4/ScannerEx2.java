package org.example.week1.day4;

import java.util.Scanner;

public class ScannerEx2 {
    public void inputTwoNumbersAndPlus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("type two numbers!");
        System.out.print("first Number : ");
        System.out.println("First Number is " + sc.nextInt());
        System.out.print("second Number : ");
        System.out.println("second Number is " + sc.nextInt());
    }
}
