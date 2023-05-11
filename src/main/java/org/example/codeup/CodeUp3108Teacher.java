package org.example.codeup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CodeUp3108Teacher {

    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String input){
        String[] splitInput = input.split(" ");
        return new Student(splitInput[0], Integer.parseInt(splitInput[1]), splitInput[2]);
    }

    // shift + 6
    private boolean isExist(Student pStudent) {
        // 중복 여부 check
        for (Student student : students){
            if(pStudent.getId() == student.getId()) return true;
        }
        return false;
    }

    private void deleteStudent(Student pStudent) {
        for (int i = 0; i < students.size(); i++) {
            if(pStudent.getId() == students.get(i).getId()) students.remove(i);
        }
    }

    public void process(String input) {
        Student pStudent = makeAStudent(input);
        switch (pStudent.getCode()){
            case "I" -> addAStudent(pStudent);
            case "D" -> deleteStudent(pStudent);
        }
    }

    private void addAStudent(Student student){
        if (!isExist(student)){
            students.add(student);
        }
    }


    private void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %s %s\n", student.getCode(), student.getId(), student.getName());
        }
    }

    private void printSpecificStudents(int[] arr){
        // 정렬
        Collections.sort(students,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() - o2.getId();
            }
        });

        // 출력
        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%s %s %s\n", student.getCode(), student.getId(), student.getName());
        }
    }

    public static void main(String[] args) {
        int size = 1;
        String[] splitted = "I 1011 한라산".split(" ");

        CodeUp3108Teacher codeup3108 = new CodeUp3108Teacher();
        codeup3108.process("I 1011 한라산");
        codeup3108.process("I 999 백두산");
        codeup3108.process("I 999 오대산");
        codeup3108.process("D 999 백두산");
        codeup3108.process("I 800 백두산");
        codeup3108.process("D 500 한라산");
        codeup3108.process("I 900 남산");
        codeup3108.process("I 950 금강산");
        codeup3108.process("I 1205 지리산");
        codeup3108.process("I 700 북한산");
        codeup3108.printSpecificStudents(new int[]{1, 2, 4, 5, 6});

    }


    public static class Student {
        int id;
        String code;
        String name;

        public Student(String code, int id, String name) {
            this.id = id;
            this.code = code;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}