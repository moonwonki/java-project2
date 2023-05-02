package org.example.week3.day2;


public class NFactorial {
    public static void main(String[] args) {
        int nInput = 5;
        int answer = 1;
        for(int i = 1; i <= nInput; i++){
            answer *= i;
        }
        System.out.println(answer);
    }
}
