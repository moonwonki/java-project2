package org.example.week5.day1;

import java.util.Arrays;

public class BubbleSort02 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}