import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> result = new ArrayList<>();
        int count1 = 0; int count2 = 0; int count3 = 0;        
        int[] a1 = {1,2,3,4,5};        int[] a2 = {2,1,2,3,2,4,2,5};        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a1[i % a1.length])   count1++;
            if (answers[i] == a2[i % a2.length])   count2++;
            if (answers[i] == a3[i % a3.length])   count3++;
        }
        if (count1 == count2 && count2 == count3) {
            result.add(1);  result.add(2);  result.add(3);
        } else if (count1 == count2 && count2 > count3) {
            result.add(1);  result.add(2);
        } else if (count1 == count3 && count3 > count2) {
            result.add(1);  result.add(3);
        } else if (count3 == count2 && count2 > count1) {
            result.add(2);  result.add(3);
        } else if (Math.max(count1, Math.max(count2, count3)) == count1) {
            result.add(1);
        } else if (Math.max(count1, Math.max(count2, count3)) == count2) {
            result.add(2);
        } else if (Math.max(count1, Math.max(count2, count3)) == count3) {
            result.add(3);
        }
        return result;
    }
}