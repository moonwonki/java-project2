package org.example.week1.day4;

public class PrintfEx {
    public void print() {
        System.out.printf("%s", "Hello\n");
        System.out.println("Bye");
    }

    public static void main(String[] args){
        PrintfEx printfEx = new PrintfEx();
        printfEx.print();
    }
}
