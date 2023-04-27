package org.example.week2.day4;

public class ComparisonArray {
    public static void main(String[] args) {
        int[] numArr = {2, 1, 7, 9};
        System.out.printf("%d > %d = %b\n", numArr[0], numArr[1], numArr[0] > numArr[1]);
        System.out.printf("%d > %d = %b\n", numArr[1], numArr[2], numArr[1] > numArr[2]);
        System.out.printf("%d > %d = %b\n", numArr[2], numArr[3], numArr[2] > numArr[3]);
    }
}
