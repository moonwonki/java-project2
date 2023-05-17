package org.example.week5.day3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack1 {
    private int[] arr = new int[10000];
    private int pointer = 0;

    public void push(int value){
        this.arr[pointer++] = value;
        //System.out.println(Arrays.toString(arr));
        //System.out.println();
    }

    public int pop(){
        if (pointer == 0){
            throw new EmptyStackException();
        }
        return arr[--pointer];
    }

    public boolean isEmpty(){
        return pointer == 0;
    }

    public int peek(){
        return arr[pointer - 1];
    }

    public int size(){
        return pointer;
    }

    public static void main(String[] args) {
        Stack1 st1 = new Stack1();
        System.out.println(st1.isEmpty());
        st1.push(10);
        System.out.println(st1.isEmpty());
        st1.push(11);
        st1.push(12);
        st1.pop();
    }
}
