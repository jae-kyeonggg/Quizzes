import java.util.*;

class Solution {
    public int solution(int[] nums) {
        ArrayList<Integer> v = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < v.size(); j++) {
                if (v.get(j) == nums[i])
                    v.remove(j);
            }
            v.add(nums[i]);
        }
        return nums.length / 2 >= v.size() ? v.size() : nums.length / 2;
    }
}