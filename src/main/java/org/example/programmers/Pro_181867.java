package org.example.programmers;

import java.util.Arrays;

public class Pro_181867 {
    public static void main(String[] args) {

        String myString = "xabcxdefxghi";


        String strArr[] = myString.split("x");

        int lengthOfArr = strArr.length;

        if (myString.charAt(myString.length() - 1) == 'x'){
            lengthOfArr++;
        }
        int answer[] = new int[lengthOfArr];


        for (int i = 0; i < strArr.length; i++){
            answer[i] = strArr[i].length();
        }

        System.out.println(Arrays.toString(answer));
    }
}
