import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> ar = new ArrayList<>();
        if (k < score.length) {
            for(int i = 0; i < k; i++) {
                ar.add(score[i]);
                Collections.sort(ar);
                answer[i] = ar.get(0);
            }
            for(int i = k; i < score.length; i++) {
                ar.add(score[i]);
                Collections.sort(ar);
                ar.remove(0);
                answer[i] = ar.get(0);
            }       
        } else {
            for (int i = 0; i < score.length; i++) {
                ar.add(score[i]);
                Collections.sort(ar);
                answer[i] = ar.get(0);
            }
        }
        
        return answer;
    }
}