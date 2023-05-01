package org.example.week3.day1;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int increaseNum = 2; increaseNum <= 4; increaseNum++){
            System.out.printf("MultiplicationTable %d\n", increaseNum);
            for (int i = 1; i < 10; i++){
                System.out.printf("%d * %d = %d\n", increaseNum, i, increaseNum*i);
            }
        }
    }
}
