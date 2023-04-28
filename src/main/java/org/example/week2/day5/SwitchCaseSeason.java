package org.example.week2.day5;

public class SwitchCaseSeason {
    public static void main(String[] args) {
        int month = 3;
        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("SPRING");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("No such month");
        }
    }
}

