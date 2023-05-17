package org.example.week5.day3;

import java.util.Stack;

public class InfixToPostfix {

    //괄호와 소수는 입력되지 않는다는 것을 전제로 진행한다.
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
            //Character isLetterOrDigit 활용. 파라미터로 오는 Char 변수가 a~z 또는 0~9인지 체크하여 true/false를 리턴한다.
            if (Character.isLetterOrDigit(cur)){
                result.append(cur);
            }
            //연산자
            else {
                //스택안에 담겨있는 제일 위의 연산자의 우선순위가 현재 커서에 해당하는 연산자의 우선순위보다 높은 경우. 스택에 담긴 연산자를 먼저 작성해줘야 "먼저 실행"되며 연산자 우선순위가 지켜진다.
                while (!opSt.isEmpty() && getPriority(cur) <= getPriority(opSt.peek())){
                    result.append(opSt.pop());
                }
                //연산자 우선순위에 문제가 없다면 바로 append하는게 아니라 stack에 담는다. append해버리면 다음 연산자가 *, X일 때 골치아프다.
                opSt.push(cur);
            }
        }

        //남은 연산자들을 전부 후위연산자 스트링에 붙여준다. 괄호는 아예 생각하지 않았기 때문에 바로 붙이는 것이 가능하다.
        while (!opSt.isEmpty()) {
            result.append(opSt.pop());
        }

        System.out.println(result);
        return result.toString();
    }
}
