package org.example.week3.day1;

public class SwitchClinicHours {
    public static void main(String[] args) {
        String day = "Monday";
        String time = "Not Open";
        switch(day) {
            case "Monday", "Tuesday", "Thursday", "Friday" -> time = "09:30-18:30";
            case "Saturday" -> time = "09:30-13:00";
            case "Wednesday", "Sunday"-> time = "Not Open";
        }
        System.out.printf("%s => %s", day, time);
    }
}
