package org.example.week4.day2;

public class GetMax extends MaxMinAbstract{

    @Override
    public int getValue(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        return max;
    }
}
