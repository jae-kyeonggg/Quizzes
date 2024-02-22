import java.util.*;

public class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : scoville) {
            queue.add(i);
        }
        if (queue.peek() >= K) return answer;
        while (!queue.isEmpty()) {
            int low1 = queue.poll();
            int low2 = queue.poll();
            int mix = low1 + low2 * 2;
            queue.add(mix);
            answer += 1;
            if (queue.peek() >= K) {
                break;
            } 
            if (queue.peek() < K && queue.size() <= 1) {
                return -1;
            }
        }
        return answer;
    }
}