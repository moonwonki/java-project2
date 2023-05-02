package org.example.programmers;

public class Pro_181923 {
    // num Array and query 2
    public int[] solution(int[] arr, int[][] queries) {
        int queryNum = queries.length;
        int[] answer = new int[queryNum];


        int count = 0;
        for (int idx = 0; idx < queryNum; idx++){
            int min = Integer.MAX_VALUE;
            for (int i = queries[idx][0]; i <= queries[idx][1]; i++){
                if (arr[i] <= queries[idx][2]) continue;
                min = Math.min(arr[i], min);
            }
            if (min == Integer.MAX_VALUE) min = -1;
            answer[count++] = min;
        }

        return answer;
    }
}
