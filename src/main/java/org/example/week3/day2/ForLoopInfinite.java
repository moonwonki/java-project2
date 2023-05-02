package org.example.week3.day2;

public class ForLoopInfinite {
    public static void main(String[] args) {
        for (int i = 2; 1 == 1; i++) {
            System.out.println(i);
            if (i == 500) break;//in order to stop the madness
        }
    }
}
