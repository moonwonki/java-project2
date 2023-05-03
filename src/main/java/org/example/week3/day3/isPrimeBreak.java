package org.example.week3.day3;

public class isPrimeBreak {

    public static void main(String[] args) {
        int num = 991;
        if (num <= 1) {
            System.out.println("not prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime);
    }
}
