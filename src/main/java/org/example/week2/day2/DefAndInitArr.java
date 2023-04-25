package org.example.week2.day2;

public class DefAndInitArr {
    public static void main(String[] args) {
        int[] iArr = new int[5];
        iArr[0] = 1;
        iArr[1] = 2;
        iArr[2] = 3;
        iArr[3] = 4;
        iArr[4] = 5;
        System.out.println(iArr);

        int[] newIntArr = new int[]{1,2,3,4};
        System.out.printf("%d, %d, %d, %d\n", newIntArr[0], newIntArr[1], newIntArr[2], newIntArr[3]);
    }
}
