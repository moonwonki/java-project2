package org.example.week5.day3;

import java.util.Arrays;

public class Stack1 {
    private int[] arr = new int[10000];
    private int pointer = 0;

    public void push(int value){
        this.arr[pointer++] = value;
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public int pop(){
        return arr[--pointer];
    }
}
