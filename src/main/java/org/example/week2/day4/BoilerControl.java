package org.example.week2.day4;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemperature = 45; // water temperature
        int roomTemperature = 22; // room temperature
        boolean check = waterTemperature < 50 && roomTemperature < 24;
        System.out.printf("check: %b\n", check);
    }
}
