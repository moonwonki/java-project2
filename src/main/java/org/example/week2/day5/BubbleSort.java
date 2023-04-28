package org.example.week2.day5;

import java.util.Arrays;
import java.util.Scanner;



public class BubbleSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Type Array Size : ");
        int arrSize = scn.nextInt();

        int numArr[] = new int[arrSize];

        for (int i = 0; i < arrSize; i++){
            numArr[i] = scn.nextInt();
        }

        numArr = bubbleSort(numArr, arrSize);

        System.out.println(Arrays.toString(numArr));
    }


    private static int[] bubbleSort(int[] arr, int size){
        for (int i = 0; i < size - 1; i++){
            for (int j = i + 1; j < size; j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
