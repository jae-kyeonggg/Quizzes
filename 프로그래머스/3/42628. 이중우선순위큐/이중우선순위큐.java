import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < operations.length; i++) {
            String[] split = operations[i].split(" ");
            String op = split[0];
            int num = Integer.parseInt(split[1]);
            if (op.equals("I")) {
                minHeap.offer(num);
                maxHeap.offer(num);
            } else if (op.equals("D")) {
                if (num == 1) {
                    if (!maxHeap.isEmpty()) {
                        int max = maxHeap.poll();
                        minHeap.remove(max);
                    }
                } else if (num == -1) {
                    if (!minHeap.isEmpty()) {
                        int min = minHeap.poll();
                        maxHeap.remove(min);
                    }
                }
            }
        }
        if (!minHeap.isEmpty()) {
            answer[1] = minHeap.peek();
        } if (!maxHeap.isEmpty()) {
            answer[0] = maxHeap.peek();
        }
        return answer;
    }
}