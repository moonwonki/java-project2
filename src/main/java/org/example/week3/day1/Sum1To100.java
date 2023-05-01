package org.example.week3.day1;

public class Sum1To100 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
            System.out.println(sum);
        }
        System.out.printf("final result : %d\n", sum);
    }
}
