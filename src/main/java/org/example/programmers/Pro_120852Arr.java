package org.example.programmers;

public class Pro_120852Arr {
    public static void main(String[] args) {
        int n = 12;
        int divisor = 2;
        int[] arr = new int[n + 1];
        // dynamic programming
//         List, Set, Map

        while (n > 1){
            if (n % divisor == 0){
                arr[divisor] = divisor;
                n /= divisor;
            }
            else{
                divisor++;
            }
        }



        int size = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0) size++;
        }
        int answer[] = new int[size];

        int lastIdx = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0) answer[lastIdx++] = i;
        }

        for (int i = 0; i < answer.length; i++){
            System.out.printf("%d ", answer[i]);
        }
    }
}
