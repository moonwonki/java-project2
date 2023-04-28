package org.example.week2.day5;

public class IfWithLogicalOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if (x > 0 && y > 0){
            System.out.println("x and y is both positive");
        }

        if (x > 0 || y > 0){
            System.out.println("At least, one of x or y is positive");
        }

        if (x < 0 && y < 0){
            System.out.println("x and y is both negative");
        }
    }
}
