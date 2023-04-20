package org.example.week1.day4;

public class PrintfTwoValueShortage {
    public static void main(String[] args) {
        try {
            System.out.printf("%s %s", "Hello");
        }
        catch (Exception e){
            System.out.printf("%s", "Error Occured!");
        }

    }
}
