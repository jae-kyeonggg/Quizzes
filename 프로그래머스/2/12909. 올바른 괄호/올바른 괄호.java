import java.util.*; 

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.charAt(0) == ')') {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (stack.isEmpty()) {
                    stack.push(s.charAt(i));
                } else {
                    if (stack.peek() == s.charAt(i)) {
                        stack.push(s.charAt(i));
                    } else if (stack.peek() == ')') {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
        }
        return !stack.isEmpty() ? false : true;
    }
}