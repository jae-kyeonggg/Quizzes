import java.util.Arrays;
import java.util.Collections;


class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < s.length(); i++) {
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}