import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int a : works) {
            heap.offer(a);
        }
        for (int i = 0; i < n; i++) {
            int top = heap.poll();
            if (top == 0) break;
            heap.offer(top - 1);
        }
        while (!heap.isEmpty()) {
            answer += Math.pow(heap.poll(), 2);
        }
        return answer;
    }
}