package org.example.week2.day5;

public class SwitchClinicHours {
    public static void main(String[] args) {
        String day = "Monday";
        String time = "Not Open";
        switch(day) {
            case "Monday", "Tuesday", "Thursday", "Friday": time = "09:30-18:30"; break;
            case "Saturday": time = "09:30-13:00"; break;
            case "Wednesday", "Sunday": time = "Not Open"; break;
        }
        System.out.printf("%s => %s", day, time);
    }
}
