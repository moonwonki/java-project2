package org.example.week5.day1;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort02 {
    Comparator<Integer> ascendCp = (o1, o2) -> o1 - o2;

    Comparator<Integer> descendCp = (o1, o2) -> o2 - o1;

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};
        BubbleSort02 bs = new BubbleSort02();

        arr = bs.sortArray(arr, false);

        System.out.println(Arrays.toString(arr));
    }

    private int[] sortArray(int[] arr, boolean isAscend) {

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++) {
                if (isAscend) {
                    if (ascendCp.compare(arr[i], arr[j]) > 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                else {
                    if (descendCp.compare(arr[i], arr[j]) > 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }
}