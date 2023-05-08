package org.example.week4.day1;

public class VariousReturnType {
    public boolean isAdult(){
        return true;
    }
    public int plus(){
        return 1 + 1;
    }
    public User getUser(){
        return new User();
    }
    public void printHello() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        VariousReturnType vrt = new VariousReturnType();
        boolean isAdult = vrt.isAdult();
        int plusResult = vrt.plus();
        User user = vrt.getUser();
        vrt.printHello();
    }

}
