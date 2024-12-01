package org.codingTest;

// 원소들의 곱과 합
public class Q_1201_4 {
    public static void main(String[] args) {
        int[] numList = new int[]{5,7,8,3};
        Q_1201_4 instance = new Q_1201_4();
        int result = instance.solution(numList);
        System.out.println("결과: " + result);

    }
    public int solution(int[] num_list) {

        int multipleResult = 1; // 모든 원소들의 곱
        int sumMultiple = 0;

       for(int num : num_list) {
           multipleResult *= num;
           sumMultiple += num;
       }

       int sumMultipleResult = sumMultiple * sumMultiple;

        return (multipleResult < sumMultipleResult) ? 1 : 0;
    }
}
