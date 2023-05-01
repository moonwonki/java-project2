package org.example.programmers;

public class NumAndQueries3 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            int[] answer = {};

            int queryNum = queries.length;

            for (int i = 0; i < queryNum; i++){
                int temp = arr[queries[i][0]];
                arr[queries[i][0]] = arr[queries[i][1]];
                arr[queries[i][1]] = temp;
            }
            return arr;
        }
    }
}
