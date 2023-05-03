package org.example.programmers;

public class Pro_12928 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0) answer += i;
        }
        return answer;
    }
}
