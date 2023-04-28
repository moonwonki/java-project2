package org.example.week2.day5;

public class SwitchCaseMyHospital {
    public static void main(String[] args) {
        String day = "Tuesday";

        String time = "Not Open";

        switch(day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday": time = "08:30-19:00"; break;
            case "Saturday": time = "09:30-16:00"; break;
            case  "Sunday": time = "Not Open"; break;
        }
        System.out.printf("%s => %s", day, time);
    }
}
