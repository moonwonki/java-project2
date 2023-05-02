package org.example.week3.day2;

public class FiveOrZero {
    public static void main(String[] args) {
        int num = 505505;

        if(isZeroOrFive(num)){
            System.out.println("Zero Or Five : true");
        }
    }

    private static boolean isZeroOrFive(int num) {
        while (num > 0){
            if (num % 10 != 5 && num % 10 != 0){
                return false;
            }
        }
        return true;
    }
}
