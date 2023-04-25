package org.example.week2.day2;

public class AccountMessage {
    public static void main(String[] args) {
        String name = "Moon Won Ki";
        int balance = 2_000_000;
        String message = name + "'s balance is " + balance + ".";
        System.out.printf("%s", message);
    }
}
