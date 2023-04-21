package org.example.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User moonwonki = new User();
        moonwonki.name = "Moon Won Ki";
        moonwonki.phoneNumber = "010-0000-0000";
        moonwonki.age = 25;

        User mooninkyoung = new User();
        mooninkyoung.name = "Moon In Kyoung";
        mooninkyoung.phoneNumber = "111";
        mooninkyoung.age = 20;

        System.out.printf("%s is adult : %b\n", moonwonki.name, moonwonki.isAdult());
        System.out.printf("%s is adult : %b\n", mooninkyoung.name, mooninkyoung.isAdult());
    }



}
