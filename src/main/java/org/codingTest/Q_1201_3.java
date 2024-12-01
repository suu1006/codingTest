package org.codingTest;

// 주사위게임 2
public class Q_1201_3 {
    public int solution(int a, int b, int c) {
        int result;

        if (a == b && b == c && a == c) {
            result = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else if (a != b && b != c && a != c) {
            result = a + b + c;
        } else {
            result = (a + b + c) * (a * a + b * b + c * c) ;
        }

        return result;
    }
}

//class Solution {
//    public int solution(int a, int b, int c) {
//        int sum = a + b + c;
//        int sumOfSquares = a * a + b * b + c * c;
//
//        if (a == b && b == c) { // 세 숫자가 모두 같을 때
//            int sumOfCubes = a * a * a + b * b * b + c * c * c;
//            return sum * sumOfSquares * sumOfCubes;
//        }
//
//        if (a != b && b != c && a != c) { // 세 숫자가 모두 다를 때
//            return sum;
//        }
//
//        // 두 숫자만 같을 때
//        return sum * sumOfSquares;
//    }
//}

