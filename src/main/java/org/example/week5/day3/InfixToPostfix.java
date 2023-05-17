package org.example.week5.day3;

import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {
        String line = "1+2*3+4";
        InfixToPostfix ipf = new InfixToPostfix();

        ipf.compute(line);
    }

    public int getPriority(char cur){
        switch (cur){
            case '+', '-' -> {
                return 1;
            }
            case '*', '/' -> {
                return 2;
            }
            default -> {
                return -1;
            }

        }
    }
    public String compute(String line) {
        Stack<Character> opSt = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < line.length(); i++){
            char cur = line.charAt(i);

            //피연산자
            if (Character.isLetterOrDigit(cur)){
                result.append(cur);
            }
            //
            else {
                while (!opSt.isEmpty() && getPriority(cur) <= getPriority(opSt.peek())){
                    result.append(opSt.pop());
                }
                opSt.push(cur);
            }
        }

        while (!opSt.isEmpty()) {
            result.append(opSt.pop());
        }

        System.out.println(result);
        return result.toString();
    }
}
