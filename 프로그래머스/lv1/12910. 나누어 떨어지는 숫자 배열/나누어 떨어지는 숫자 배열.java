import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                ar.add(arr[i]);
            }
        } if (ar.size() == 0) {
            ar.add(Integer.valueOf(-1));
        }
        Collections.sort(ar);
        
        return ar;
    }
}