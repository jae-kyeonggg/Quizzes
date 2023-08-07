import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}