import java.util.*;

public class Solution {
    public Stack<Integer> solution(int[] ar) {
        Stack<Integer> stack = new Stack<>();
        for (int i : ar) {
            if (!stack.isEmpty()) {
                if (stack.peek() != i) {
                    stack.push(i);
                }
            } else {
                stack.push(i);
            }
        }        
        return stack;
    }
}