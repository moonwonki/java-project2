package org.example.week2.day3;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].age = 10;
        students[0].name = "abc";
        students[0].phoneNumber = "000-0000-0000";

        students[1] = new Student();
        students[1].age = 15;
        students[1].name = "def";
        students[1].phoneNumber = "111-1111-1111";
    }
}
