package org.example.week3.day4;

public class GetMin {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9, 6};

        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minVal) minVal = arr[i];
        }

        System.out.println(minVal);
    }
}
