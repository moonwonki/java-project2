package org.example.week3.day1;

public class NewSwitchCaseSeason {
    public static void main(String[] args) {
        int month = 11;
        switch(month) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Fall");
            default -> System.out.println("There is no such month");
        }
    }
}
