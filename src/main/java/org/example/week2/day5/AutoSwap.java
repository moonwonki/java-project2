package org.example.week2.day5;

import java.util.Arrays;

public class AutoSwap {
    public static void main(String[] args) {

        int numArr[] = {2, 1, 7, 9};
        boolean check = numArr[0] > numArr[1];

        if (check){
            int temp = numArr[0];
            numArr[0] = numArr[1];
            numArr[1] = temp;
        }

        System.out.println(Arrays.toString(numArr));
    }
}
