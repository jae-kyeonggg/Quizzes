import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;     int[] score = new int[3];
        int cur = 0;    int idx = 0;    String num = "";
        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num += String.valueOf(ch);
            } else if (ch == 'S' || ch == 'D' || ch == 'T') {
                cur = Integer.parseInt(num);
                if (ch == 'S') {
                    cur = (int) Math.pow(cur, 1);
                } else if (ch == 'D') {
                    cur = (int) Math.pow(cur, 2);
                } else {
                    cur = (int) Math.pow(cur, 3);
                }
                score[idx++] = cur;
                num = "";
            } else {
                if (ch == '#') {
                    score[idx - 1] *= -1;
                } else {
                    score[idx - 1] *= 2;
                    if (idx - 2 >= 0) {
                        score[idx - 2] *= 2;
                    }
                }
            }
        }
        for (int i = 0; i < score.length; i++) {
            answer += score[i];
        }
        
        return answer;
    }
}