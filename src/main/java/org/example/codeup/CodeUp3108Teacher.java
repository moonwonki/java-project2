package org.example.codeup;

import java.util.ArrayList;
import java.util.List;

public class CodeUp3108Teacher {

    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int testId, String name){
        return new Student(code, testId, name);
    }

    // shift + 6
    private boolean isExist(Student pStudent) {
        // 중복 여부 check
        for (Student student : students){
            if(pStudent.getCode().equals(student.getCode())) return true;
        }
        return false;
    }

    private void deleteStudent(Student pStudent) {
        for (int i = 0; i < students.size(); i++) {
            if(pStudent.getId() == students.get(i).getId()) students.remove(i);
        }
    }

    public void process(Student pStudent) {
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

    public static void main(String[] args) {
        int size = 1;
        String[] splitted = "I 1011 한라산".split(" ");

        CodeUp3108Teacher codeup3108 = new CodeUp3108Teacher();
        Student student = codeup3108.makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        codeup3108.process(student);
        codeup3108.printStudents();

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