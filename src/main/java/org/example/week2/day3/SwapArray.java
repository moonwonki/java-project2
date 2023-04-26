package org.example.week2.day3;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arrSwapEx = {1, 2, 3, 4, 5};
        int tempNum = arrSwapEx[0];
        arrSwapEx[0] = arrSwapEx[1];
        arrSwapEx[1] = tempNum;

        System.out.println(Arrays.toString(arrSwapEx));
    }
}
