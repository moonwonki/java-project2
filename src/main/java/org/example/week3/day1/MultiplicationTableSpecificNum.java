package org.example.week3.day1;

public class MultiplicationTableSpecificNum {
    public static void main(String[] args) {
        int dan[] = {1, 2, 5, 7};

        for (int i = 0; i < dan.length; i++){
            printMult(dan[i]);
        }
    }

    private static void printMult(int paramNum){
        System.out.printf("Multiplication %d table\n", paramNum);
        for (int j = 1; j < 10; j++){
            System.out.printf("%d * %d = %d\n", paramNum, j, paramNum * j);
        }
    }
}
