package org.example.week2.day4;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int smallX = 10;
        smallX += 1;
        System.out.printf("+=1 %d\n", smallX);

        smallX -= 5;
        System.out.printf("-=5 %d\n", smallX);

        smallX *= 2;
        System.out.printf("*=2 %d\n", smallX);

        smallX /= 3;
        System.out.printf("/=3 %d\n", smallX);

        smallX %= 8;
        System.out.printf("%%=8 %d\n", smallX);
    }
}
