package org.example.week4.day2;

public class GetMin extends MaxMinAbstract{

    @Override
    public int getValue(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i]);
        }

        return min;
    }
}
