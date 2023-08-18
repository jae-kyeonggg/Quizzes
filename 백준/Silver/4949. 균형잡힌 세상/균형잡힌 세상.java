import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = br.readLine()).equals(".")) {
            Stack<Character> stack = new Stack<>();
            boolean valid = true;
            for (int i = 0; i < input.length(); i++) {
                char a = input.charAt(i);
                if (a == '(' || a == '[') {
                    stack.push(a);
                }
                if (a == ')') {
                    if (stack.size() == 0) {
                        System.out.println("no");
                        valid = false;
                      break;
                    } else if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        System.out.println("no");
                        valid = false;
                        break;
                    }
                }
                if (a == ']') {
                    if (stack.size() == 0) {
                        System.out.println("no");
                        valid = false;
                        break;
                    } else if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        System.out.println("no");
                        valid = false;
                        break;
                    }
                }
            }
            if (valid) {
                if (stack.isEmpty()) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
