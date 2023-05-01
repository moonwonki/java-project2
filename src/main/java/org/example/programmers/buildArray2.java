package org.example.programmers;

public class buildArray2 {
    class Solution {
        public int[] solution(int l, int r) {
            int[] answer = {};
            int size = 0;
            for (int i = l; i <= r ; i++){
                if (zeroFiveCheck(i)) size++;
            }

            answer = new int[size];
            int count = 0;
            for (int i = l; i <= r ; i++){
                if (zeroFiveCheck(i)){
                    answer[count++] = i;
                }
            }

            if (answer.length == 0){
                answer = new int[] {-1};
            }
            return answer;
        }

        public static boolean zeroFiveCheck(int num){
            while (num != 0){
                if (num % 10 == 0 || num % 10 == 5){
                    num /= 10;
                }
                else return false;
            }
            return true;
        }
    }
}
