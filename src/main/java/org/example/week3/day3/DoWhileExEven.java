package org.example.week3.day3;

import java.util.Scanner;

public class DoWhileExEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.print("Type Even Number : ");
            input = scanner.nextInt();
        } while (input % 2 != 0);
        System.out.println("Even Number input :  " + input);
    }
}
