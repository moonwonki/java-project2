package org.example.programmers;


import java.util.Arrays;

public class pro_120880 {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int index = 0;
        for (int i = 0; i < 10000; i++){
            if (i == 0) {
                int cur = n;
                int indexOfIt = contains(numlist, cur);
                if (indexOfIt != -1) answer[index++] = numlist[indexOfIt];
                continue;
            }
            for (int d = 0; d < 2; d++){
                int cur = d == 0 ? n + i : n - i;
                int indexOfIt = contains(numlist, cur);
                if (indexOfIt != -1) answer[index++] = numlist[indexOfIt];

                if (index == numlist.length) break;
            }
            if (index == numlist.length) break;
        }
        return answer;
    }

    public static int contains(int num[], int n){
        for (int i = 0; i < num.length; i++){
            if (num[i] == n) return i;
        }

        return -1;
    }


    public static void main(String[] args) {
        int numlist[] = {10000,20,36,47,40,6,10,7000};
        int n = 30;

        System.out.println(Arrays.toString(solution(numlist, n)));
    }
}
