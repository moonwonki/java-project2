package org.example.week4.day1;

public class MutsaMath {
    public static void main(String[] args) {
        MutsaMath mutsaMath = new MutsaMath();
        mutsaMath.printSumOfFactors(12);
        mutsaMath.printSumOfFactors(36);
        mutsaMath.printSumOfFactors(48);
        mutsaMath.printSumOfFactors(29);
    }

    //method
        public int sumOfFactors(int num){
        int sum = 0;

        int divisor = 1;
        while(divisor <= num){
            if (num % divisor == 0) {
                sum += divisor;
            }
            divisor++;
        }

        return sum;
    }

    public void printSumOfFactors(int num){
        System.out.printf("%d  ->  %d\n", num, sumOfFactors(num));
    }
}
