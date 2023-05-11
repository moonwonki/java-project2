package org.example.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;


/*
이렇게 하는게 맞는건지 모르겠는데 일단 student 클래스의 hashcode랑 equals 메소드를 오버라이드해서 바꿨습니다ㅠㅠ

 */

public class CodeUp3108HashCode {
    static List<Student> studentList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int numInput = Integer.parseInt(br.readLine());

        studentList = new ArrayList<>();

        for (int i = 0; i < numInput; i++){
            st = new StringTokenizer(br.readLine());

            Student tmp = new Student();
            tmp.code = st.nextToken();
            tmp.id = Integer.parseInt(st.nextToken());
            tmp.name = st.nextToken();

            executeCode(tmp);

        }

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.id > o2.id) return 1;
                else if (o1.id == o2.id) return 0;
                else return -1;
            }
        });

        st = new StringTokenizer(br.readLine());
        int tokens = st.countTokens();
        for (int i = 0; i < tokens; i++){
            int findIndex = Integer.parseInt(st.nextToken()) - 1;

            System.out.println(studentList.get(findIndex).id + " " +studentList.get(findIndex).name);
        }
    }

    public static void executeCode(Student input){
        if (input.code.charAt(0) == 'I' && !isContained(input)){
            studentList.add(input);
        }
        else if (input.code.charAt(0) == 'D'){
            for (int i = 0; i < studentList.size(); i++){
                //hashcode 활용. equals.
                if (studentList.get(i).equals(input)) {
                    studentList.remove(i);
                    break;
                }
            }
        }
    }

    public static boolean isContained(Student input){
        for (int i = 0; i < studentList.size(); i++){
            //hashCode 활용 equals.
            if (studentList.get(i).equals(input)) return true;
        }
        return false;
    }

    public static class Student {
        int id;
        String code;
        String name;

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            return obj.hashCode() == this.hashCode();
        }
    }
}
