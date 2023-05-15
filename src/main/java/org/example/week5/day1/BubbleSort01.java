package org.example.week5.day1;

import java.util.Arrays;

public class BubbleSort01 {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 3, 4, 5};

        arr = getSorted(arr);


        System.out.println(Arrays.toString(arr));
    }

    private static int[] getSorted(int[] arr) {
        for (int j = 1; j <= arr.length - 1; j++){
            arr = sortARound(arr, j);
        }
        return arr;
    }

    private static int[] sortARound(int[] arr, int j) {
        for (int i = 0; i < arr.length - j; i++){
            int temp = arr[i];
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }
}


