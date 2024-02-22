import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[] n1 = {1,2,3,4,5};
        int[] n2 = {2,1,2,3,2,4,2,5};
        int[] n3 = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == n1[i % n1.length]) score[0] += 1;
            if (answers[i] == n2[i % n2.length]) score[1] += 1;
            if (answers[i] == n3[i % n3.length]) score[2] += 1;
        }
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        for (int i = 0; i < 3; i++) {
            if (max == score[i]) ar.add(i + 1);
        }
        return ar;
    }
}