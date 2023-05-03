package org.example.week3.day2;

public class ZeroOrFive {
    public static void main(String[] args) {
        int num = 505504;

        if(isZeroOrFive(num)){
            System.out.println("Zero Or Five : true");
        }
    }

    private static boolean isZeroOrFive(int num) {
        while (num > 0){
            int remainder = num % 10;
            if (remainder % 5 != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
