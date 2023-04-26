package org.example.week2.day3;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        answer = answer + num % 10;
        System.out.printf("answer:%d\n", answer);

        num = num / 10;
        answer = answer + num % 10;
        System.out.printf("answer : %d\n", answer);

        num = num / 10;
        answer = answer + num % 10;
        System.out.printf("answer:%d\n", answer);

    }
}
