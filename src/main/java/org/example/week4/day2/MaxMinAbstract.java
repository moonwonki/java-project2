package org.example.week4.day2;

public abstract class MaxMinAbstract {
    public abstract int arrValue(int value, int arrValue);
    public int getValue(int[] arr){

        int value = arr[0];

        for (int i = 0; i < arr.length; i++){
            value = arrValue(value, arr[i]);
        }
        return value;
    }
}
