package org.example.week4.day2;

public class MultiplicationTableSymbol {
    private String multipleSymbol;

    public MultiplicationTableSymbol(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public void printDan(int dan) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("-----------");
    }

    public static void main(String[] args) {
        MultiplicationTableSymbol mt = new MultiplicationTableSymbol("x");
        mt.printDan(2);
        mt.printDan(5);
        MultiplicationTableSymbol mt2 = new MultiplicationTableSymbol("*");
        mt2.printDan(7);
        mt2.printDan(8);
    }

}
