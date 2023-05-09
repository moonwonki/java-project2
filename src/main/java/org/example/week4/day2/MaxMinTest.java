package org.example.week4.day2;

public class MaxMinTest {

    public static void main(String[] args) {
        int numArr[] = {1, 3, 6, 8, 10, 15, 30};


        //get Max
        MaxMinAbstract mm = new GetMax();
        System.out.println("max value : " + mm.getValue(numArr));

        //get Min
        mm = new GetMin();
        System.out.println("min value : " + mm.getValue(numArr));
    }
}
