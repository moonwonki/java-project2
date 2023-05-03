package org.example.week3.day3;

public class isPrime {
    public static void main(String[] args) {
        int num = 7;
        int factors = 0;

        for (int i = 2; i < num - 1; i++){
            if (num % i == 0) factors++;
        }

        System.out.printf("factors : %d\n", factors);

        System.out.println(factors == 0 ? "isPrime? : true" : "isPrime? : false");
    }
}
