import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String num = String.valueOf(n) + "0";
        String Sanswer = "";
        int[] arr = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            arr[i] = Integer.parseInt(num.substring(i, i + 1));
        }
        Integer[] array = new Integer[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];    
        }
        
        Arrays.sort(array, Collections.reverseOrder());
        
        for (int i = 0; i < num.length() - 1; i++) {
            Sanswer += String.valueOf(array[i]);
        }
        
        return Long.parseLong(Sanswer);
    }
}