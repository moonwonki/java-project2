package org.example.programmers;

public class DiceGame {

    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;
            int oddNum = 0;
            int evenNum = 0;

            for (int i = 0; i < num_list.length; i++){
                if (num_list[i] % 2 == 0) evenNum = evenNum * 10 + num_list[i];
                else oddNum = oddNum * 10 + num_list[i];
            }

            answer = oddNum + evenNum;
            return answer;
        }
    }
}
