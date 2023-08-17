import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            int n1 = 0; int n2 = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                    n1++;
                } else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                        n2++;
                    } else {
                        n2++;
                    }
                }
            }
            if (stack.isEmpty() && n1 == n2) {
                bw.write("YES" + "\n");
            } else {
                bw.write("NO" + "\n");
            }
        }
        bw.close();
    }
}
