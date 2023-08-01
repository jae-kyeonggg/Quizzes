import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;    int result = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum <= budget) {
                result = i + 1;
            }
        }
        return result;
    }
}