package org.example.week3.day2;

public class WhileFactorial {
    public static void main(String[] args) {
        int numInput = 5;

        int answer = 1;

        while (numInput > 0){
            answer *= numInput--;
        }
        System.out.println(answer);
    }
}
