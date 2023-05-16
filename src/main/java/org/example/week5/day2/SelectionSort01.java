package org.example.week5.day2;

import java.util.Arrays;

public class SelectionSort01 {
    public static void main(String[] args) {
        int arr[] = {7, 2, 3, 9, 28, 11};

        SelectionSort01 ss = new SelectionSort01();
        arr = ss.sort(arr, false);

        System.out.println(Arrays.toString(arr));

    }

    public int[] sort(int[] arr){
        return sort(arr, true);
    }

    public int[] sort(int[] arr, boolean isAscend) {
        for (int j = 0; j < arr.length; j++){
            int targetValue = arr[j];
            int targetIdx = j;

            for (int i = j + 1; i < arr.length; i++){
                if (isAscend ? targetValue > arr[i] : targetValue < arr[i]){
                    targetValue = arr[i];
                    targetIdx = i;
                }
            }

            int temp = arr[j];
            arr[j] = arr[targetIdx];
            arr[targetIdx] = temp;
        }

        return arr;
    }
}
