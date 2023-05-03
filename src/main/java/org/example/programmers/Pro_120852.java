package org.example.programmers;

import java.util.ArrayList;

public class Pro_120852 {
    public static void main(String[] args) {
        int n = 420;
        ArrayList<Integer> result = new ArrayList<>();

        int division = 2;
        while (division <= n){
            if (n % division == 0){
                n /= division;
                if (!result.contains(division)) result.add(division);
            }
            else {
                division++;
            }
        }


        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        //return answer;
        return;
    }
}
