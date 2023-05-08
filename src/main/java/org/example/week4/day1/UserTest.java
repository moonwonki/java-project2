package org.example.week4.day1;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "aaa";
        user1.age = 14;


        User user2 = new User();
        user2.name = "bbb";
        user2.age = 34;

        System.out.printf("%b\n", user1.isAdult());
        System.out.printf("%b\n", user2.isAdult());
    }
}
