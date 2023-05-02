package org.example.codeup;
import java.util.Scanner;

public class CodeUp1278 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numInput = scn.nextInt();

        int count = 0;
        while (numInput / 10 != 0){
            numInput /= 10;
            count++;
        }
        System.out.println(count+1);
    }
}
