package org.example.week4.day1;

public class UserFactory {
    public User getAdultUser() {
        User userResult = new User();
        userResult.age = 25;
        return userResult;
    }
}
