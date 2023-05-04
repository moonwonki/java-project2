package org.example.week3.day4;

public class GetMax {
    public static void main(String[] args) {
        int arr[] = {3, 6, 4, 7, 1, 9, 2, 5};

        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (maxVal < arr[i]) maxVal = arr[i];
        }

        System.out.println(maxVal);
    }
}
