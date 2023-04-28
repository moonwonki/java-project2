package org.example.week2.day5;

public class GetGrade {
    public static void main(String[] args) {
        int score = 75;

        if (score >= 90){
            System.out.println("A");
        }
        else if (score >= 80){
            System.out.println("B");
        }
        else if (score >= 70){
            System.out.println("C");
        }
        else {
            System.out.println("F");
        }
    }
}
