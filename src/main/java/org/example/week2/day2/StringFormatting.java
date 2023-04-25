package org.example.week2.day2;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "Moon Won Ki";
        int balance = 2_000_000;
        String message = String.format("%s's balance is %s.", name, balance);
        System.out.printf("%s", message);
    }
}
