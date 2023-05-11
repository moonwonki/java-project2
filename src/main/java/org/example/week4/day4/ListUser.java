package org.example.week4.day4;



import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        User user1 = new User("Kim", "010-0101-1010", 37);
        userList.add(user1);

        User user2 = new User("Na", "010-0111-0101", 27);
        userList.add(user2);

        for (User user: userList){
            System.out.printf("%s's phone number is %s\n", user.getName(), user.getPhoneNumber());
        }
    }
}
