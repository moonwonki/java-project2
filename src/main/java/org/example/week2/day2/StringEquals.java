package org.example.week2.day2;

public class StringEquals {

    public static void main(String[] args) {
        System.out.println("Gold"=="Gold");//true

        System.out.println("Gold"== new String("Gold"));//false

        String fullWord = "Gold";
        String firstCharOfWord = "G";
        boolean isSame = fullWord.substring(0,1) == firstCharOfWord;
        System.out.println(isSame);//false

        System.out.println("Gold".equals(new String ("Gold")));//true
    }
}
