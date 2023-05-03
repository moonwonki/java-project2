package org.example.codeup;

import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numInput = scn.nextInt();

        while (numInput / 10 != 0){
            numInput = solution(numInput);
        }

        System.out.println(numInput);
    }


    public static int solution(int n) {
        int answer = 0;

        while (n != 0){
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
