package org.example.week4.day1;

public class Payment {
    public static void main(String[] args) {
        Account account = new Account();
        boolean isSufficient = account.isSufficient();

        if (isSufficient){
            System.out.println("Payment finished!");
        }
        else {
            System.out.println("No money!");
        }
    }
}
