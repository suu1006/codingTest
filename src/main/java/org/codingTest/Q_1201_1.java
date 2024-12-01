package org.codingTest;

// 코드 처리하기
public class Q_1201_1 {

    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') mode = 1 - mode;
            else if (i % 2 == mode) answer += code.charAt(i);
        }
        return "".equals(answer) ? "EMPTY" : answer;
    }

}



