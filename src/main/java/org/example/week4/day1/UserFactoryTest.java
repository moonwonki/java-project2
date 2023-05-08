package org.example.week4.day1;

public class UserFactoryTest {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();

        User user1 = userFactory.getAdultUser();

        System.out.println(user1.isAdult());
    }
}
