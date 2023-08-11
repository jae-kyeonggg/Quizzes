import java.util.*;

class Solution {
    public int solution(int[] nums) {
        ArrayList<Integer> set = new ArrayList<>();     int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    set.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (isPrime(Integer.parseInt(String.valueOf(it.next()))) == true) {
                count++;
            }
        }
        return count;
    }
    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}