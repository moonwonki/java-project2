package org.example.week1;

import java.util.Scanner;

public class ReScannerEx {
    private int plusTwoNumbers(int val1, int val2){
        return val1 + val2;
    }

    public void readTwoNumberAndPlus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type two NUMBERS!");
        System.out.println(plusTwoNumbers(sc.nextInt(), sc.nextInt()));
    }
}
