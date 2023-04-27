package org.example.week2.day4;

public class SumOfValues {
    public static void main(String[] args) {
        int[] numArr = {2, 1, 7, 4};

        //first implementation
        System.out.println(numArr[0]);
        System.out.println(numArr[1]);
        System.out.println(numArr[2]);
        System.out.println(numArr[3]);

        System.out.println(numArr[0] + numArr[1] + numArr[2] + numArr[3]);

        System.out.println("============================");

        //second implementation
        int answer = 0;
        answer = answer + numArr[0];
        answer = answer + numArr[1];
        answer = answer + numArr[2];
        answer = answer + numArr[3];

        System.out.printf("answer: %d", answer);

    }
}
