package org.example.week2.day4;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        int personAge = 25;
        boolean isStudent = false;

        if (personAge >= 18 && !isStudent){
            System.out.println("This Person is not an adult and not a student");
        }
    }
}
