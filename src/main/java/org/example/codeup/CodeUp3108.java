package org.example.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class CodeUp3108 {
    static List<Student> studentList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int numInput = Integer.parseInt(br.readLine());

        studentList = new ArrayList<>();

        //입력받기
        for (int i = 0; i < numInput; i++){
            st = new StringTokenizer(br.readLine());

            Student tmp = new Student();
            tmp.code = st.nextToken();
            tmp.id = Integer.parseInt(st.nextToken());
            tmp.name = st.nextToken();

            executeCode(tmp);

        }

        //입력받은 결과 정렬하기.
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.id > o2.id) return 1;
                else if (o1.id == o2.id) return 0;
                else return -1;
            }
        });

        //입력받은 인덱스에 해당하는 사람 호출하기.
        st = new StringTokenizer(br.readLine());
        int tokens = st.countTokens();
        for (int i = 0; i < tokens; i++){
            int findIndex = Integer.parseInt(st.nextToken()) - 1;

            System.out.println(studentList.get(findIndex).id + " " +studentList.get(findIndex).name);
        }
    }

    //I인지 D인지 판별하여 개별적으로 코드 실행하기.
    public static void executeCode(Student input){
        if (input.code.charAt(0) == 'I' && !isContained(input.id)){
            studentList.add(input);
        }
        else if (input.code.charAt(0) == 'D'){
            for (int i = 0; i < studentList.size(); i++){
                if (studentList.get(i).id == input.id) {
                    studentList.remove(i);
                    break;
                }
            }
        }
    }

    public static boolean isContained(int id){
        for (int i = 0; i < studentList.size(); i++){
            if (studentList.get(i).id == id) return true;
        }
        return false;
    }

    public static class Student {
        int id;
        String code;
        String name;
    }
}
