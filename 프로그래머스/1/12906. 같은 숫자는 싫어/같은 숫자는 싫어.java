import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                if (stack.peek() != i) {
                    stack.push(i);
                }
            }
        }
        return stack;
    }
}