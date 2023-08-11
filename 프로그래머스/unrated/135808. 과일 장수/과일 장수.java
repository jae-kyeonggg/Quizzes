import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int sum = 0;
        Arrays.sort(score);
        for (int i = score.length - m + 1; i > 0; i -= m) {
            sum += score[i - 1] * m;
        }
        return sum;
    }
}