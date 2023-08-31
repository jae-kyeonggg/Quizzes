import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();   int max = 0;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int input = Integer.parseInt(br.readLine());
            if (input > max) {
                for (int i = max + 1; i <= input; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                max = input;
            } else if (stack.peek() != input) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}