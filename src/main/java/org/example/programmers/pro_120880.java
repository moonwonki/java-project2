package org.example.programmers;


import java.util.Arrays;

public class pro_120880 {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int index = 0;

        //수의 제한이 +-10000을 벗어나지 못한다.
        //따라서 0부터 10000까지의 수를 n에다 더하고 뺀다. n + i = cur라는 변수를 얻고, 해당하는 변수값이 배열에 존재하는지 확인한다음, 존재한다면 answer 배열에 집어넣는다.
        //그 후에 n - i = cur라는 변수를 얻어서 똑같은 과정을 거친다.
        //해당하는 과정에서 i을 더하는 거 먼저, i을 빼는 거 나중으로 순서를 맞춰야 한다. 따라서 d를 반복변수로 사용하는 for문과 d가 0일 때는 + i, d가 1일 때는 - i를 하도록 사용한다.
        //다만 첫번째 반복의 경우 i가 0인데 n + i와 n - i는 값이 같기 때문에 contains(n+i)한 값을 배열에 찾아서 넣는 과정이 두번 일어난다.
        //따라서 i==0인 경우를 따로 빼는 과정이다.
        for (int i = 0; i < 10000; i++){
            if (i == 0) {
                int cur = n;
                int indexOfIt = contains(numlist, cur);
                if (indexOfIt != -1) answer[index++] = numlist[indexOfIt];
                continue;
            }
            for (int d = 0; d < 2; d++){
                int cur = d == 0 ? n + i : n - i;
                int indexOfIt = contains(numlist, cur);
                if (indexOfIt != -1) answer[index++] = numlist[indexOfIt];

                if (index == numlist.length) break;
            }
            if (index == numlist.length) break;
        }
        return answer;
    }

    public static int contains(int num[], int n){
        for (int i = 0; i < num.length; i++){
            if (num[i] == n) return i;
        }

        return -1;
    }


    public static void main(String[] args) {
        int numlist[] = {10000,20,36,47,40,6,10,7000};
        int n = 30;

        System.out.println(Arrays.toString(solution(numlist, n)));
    }
}
