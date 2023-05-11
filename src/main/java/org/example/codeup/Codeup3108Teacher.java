package org.example.codeup;

import java.util.ArrayList;
import java.util.List;

public class Codeup3108Teacher {
    public static class Student {
        private String code;
        private String testId;
        private String name;

        public Student(String code, String testId, String name) {
            this.code = code;
            this.testId = testId;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public String getTestId() {
            return testId;
        }

        public String getName() {
            return name;
        }
    }

    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, String testId, String name){
        return new Student(code, testId, name);
    }

    public boolean isDuplicated(Student pStudent) {
        // 중복 여부 check
        for (Student student : students){
            if(pStudent.getCode().equals(student.getCode())) return true;
        }
        return false;
    }

    public void addAStudent(Student student){
        if (!isDuplicated(student)){
            students.add(student);
        }
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }


    public static void main(String[] args) {
        int size = 1;
        String[] splitted = "I 1011 한라산".split(" ");

        Codeup3108Teacher codeup3108 = new Codeup3108Teacher();
        Student student = codeup3108.makeAStudent(splitted[0], splitted[1], splitted[2]);


        codeup3108.addAStudent(student);
        codeup3108.printStudents();


    }
}
