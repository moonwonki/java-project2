package org.example.week3.day3;

public class SumOfOdds {
    public static void main(String[] args) {
        int answer = 0;
        int num = 10;
        for (int i = 1; i <= num; i++) {
            if(i % 2 != 0){
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
