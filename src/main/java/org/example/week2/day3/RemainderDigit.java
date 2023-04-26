package org.example.week2.day3;

public class RemainderDigit {
    public static void main(String[] args) {
        int calNum = 687;

        int firstRemain = calNum % 10;
        calNum = calNum / 10;

        int secondRemain = calNum % 10;
        calNum = calNum / 10;

        int thirdRemain = calNum % 10;
        calNum = calNum / 10;

        System.out.printf("sum of all digits in number : %d", firstRemain + secondRemain + thirdRemain);
    }
}
