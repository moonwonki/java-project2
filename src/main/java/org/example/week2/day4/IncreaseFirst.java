package org.example.week2.day4;

public class IncreaseFirst {
    public static void main(String[] args) {
        // before using
        int idx = 0;
        int[] numArr = {2, 1, 7, 4};

        System.out.println(numArr[idx]);
        idx += 1;

        System.out.println(numArr[idx]);
        idx += 1;

        System.out.println(numArr[idx]);

        System.out.println("==================");
        // after using
        idx = 0;
        System.out.println(numArr[idx++]);
        System.out.println(numArr[idx++]);
        System.out.println(numArr[idx]);

    }
}
