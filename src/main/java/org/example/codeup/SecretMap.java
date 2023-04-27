package org.example.codeup;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        //make whole map
        int wholeMap[] = new int[n];

        for (int i = 0; i < n; i++){
            //Binary Or Operate
            wholeMap[i] = arr1[i] | arr2[i];

            //Change Integer to String format
            answer[i] = String.format("%s", Integer.toBinaryString(wholeMap[i]));
            while (answer[i].length() < n){
                answer[i] = " " + answer[i];
            }

            //Change the String format into result format.
            answer[i] = answer[i].replaceAll("0", " ");
            answer[i] = answer[i].replaceAll("1", "#");
        }


        return answer;
    }
}
