import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> stack = new Stack<>();    int sum = 0;
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0) {
                stack.push(String.valueOf(n));
            } else {
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            sum += Integer.parseInt(stack.pop());
        }
        System.out.println(sum);
    }
}
