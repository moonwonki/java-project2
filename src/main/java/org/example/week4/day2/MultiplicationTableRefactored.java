package org.example.week4.day2;

public class MultiplicationTableRefactored {
    public static void main(String[] args) {
        
        int baseNum = 2;
        multiplicationPrint(baseNum);
    }

    private static void multiplicationPrint(int baseNum) {
        System.out.printf("MultiplicationTable %d\n", baseNum);
        for (int i = 1; i < 10; i++){
            System.out.printf("%s", makeAMultLine(baseNum, i));
        }
    }

    private static String makeAMultLine(int baseNum, int i) {
        return String.format("%d * %d = %d\n", baseNum, i, baseNum * i);
    }
}
