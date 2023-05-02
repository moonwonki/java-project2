package org.example.programmers;

public class Pro_181925 {
    public String solution(int[] numLog) {
        String answer = "";

        for (int i = 0; i < numLog.length - 1; i++){
            if (numLog[i] + 1 == numLog[i+1]) answer += "w";
            else if (numLog[i] - 1 == numLog[i+1]) answer += "s";
            else if (numLog[i] + 10 == numLog[i+1]) answer += "d";
            else if (numLog[i] - 10 == numLog[i+1]) answer += "a";
        }
        return answer;
    }
}
