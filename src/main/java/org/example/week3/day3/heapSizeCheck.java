package org.example.week3.day3;

import java.util.Stack;

public class heapSizeCheck {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        //83886000
        for (int i = 0; i < Integer.MAX_VALUE; i++){
            st.push(i);
            if (i % 1000 == 0) {
                System.out.println(i);
            }
        }
    }
}
