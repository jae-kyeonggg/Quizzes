import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < operations.length; i++) {
            String command = operations[i].split(" ")[0];
            int num = Integer.parseInt(operations[i].split(" ")[1]);
            if (command.equals("I")) {
                minHeap.offer(num); maxHeap.offer(num);
            } else {
                if (num == 1) {
                    if (!maxHeap.isEmpty()) {
                        int a = maxHeap.poll();
                        minHeap.remove(a);
                    }
                } else {
                    if (!minHeap.isEmpty()) {
                        int b = minHeap.poll();
                        maxHeap.remove(b);
                    }
                }
            }
        }
        if (!maxHeap.isEmpty()) answer[0] = maxHeap.peek();
        if (!minHeap.isEmpty()) answer[1] = minHeap.peek();
        return answer;
    }
}