package org.example.week3.day2;

public class WhileTrue {
    public static void main(String[] args) {
        int cnt = 0;
        while(true){
            System.out.printf("%d ", cnt++);

            if (cnt == 100) {
                break;
            }
        }
    }
}
