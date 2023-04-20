package org.example.codeup;

public class CodeUp1008 {
    //현재 본인 환경에서 java와 인텔리제이의 호환성 문제로 인해 unicode가 ???로 출력된다.
    public static void main(String[] args) {
        String str = "\u250C\u252C\u2510\n\u251C\u253C\u2524\n\u2514\u2534\u2518";
        System.out.println(str);
    }
}
