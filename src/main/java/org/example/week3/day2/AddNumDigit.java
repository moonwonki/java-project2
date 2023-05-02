package org.example.week3.day2;

public class AddNumDigit {
    public static void main(String[] args) {
        System.out.println(solution(678));
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
