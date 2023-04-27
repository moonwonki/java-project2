package org.example.week2.day4;

public class Accumulate687While {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        while (num > 0){
            answer = answer + num % 10;
            System.out.printf("%d\n", answer);
            num = num / 10;
        }

        System.out.println("final answer : " + answer);

    }
}
