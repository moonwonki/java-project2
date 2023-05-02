package org.example.week3.day2;

public class Digits {
    public static void main(String[] args) {
        int numInput = 204;

        int count = 0;
        while (numInput / 10 != 0){
            numInput /= 10;
            count++;
        }
        System.out.println(count+1);
    }
}
