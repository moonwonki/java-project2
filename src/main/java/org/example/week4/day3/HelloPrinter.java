package org.example.week4.day3;

public class HelloPrinter {
    public void print(String message){
        System.out.println(message);
    }

    public void repeatMessage(int n, String message) {
        for (int i = 0; i < n; i++){
            print(message);
        }
    }

    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter();
        hp.print("Hello");
        hp.print("Bye");
    }
}
