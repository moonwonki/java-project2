package org.example.week2.day3;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no = 1;
        classInSchool.teacher = new Teacher();
        classInSchool.students = new Student[30];


        classInSchool.teacher.name = "Moon";
        classInSchool.teacher.age = 30;

        System.out.println("classInSchool.teacher.name = " + classInSchool.teacher.name);
    }
}
