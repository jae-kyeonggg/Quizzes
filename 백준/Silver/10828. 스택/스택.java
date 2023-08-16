import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();   int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();   String[] ar = s.split(" ");
            switch (ar[0]) {
                case "push":
                    stack.push(Integer.valueOf(ar[1]));
                    break;
                case "pop":
                    if (!stack.isEmpty()) {
                        bw.write(String.valueOf(stack.pop()));
                        bw.write("\n");
                    } else {
                        bw.write(String.valueOf(-1));
                        bw.write("\n");
                    }
                    break;
                case "size":
                    bw.write(String.valueOf(stack.size()));
                    bw.write("\n");
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        bw.write(Integer.toString(1));
                        bw.write("\n");
                    } else {
                        bw.write(Integer.toString(0));
                        bw.write("\n");
                    }
                    break;
                case "top":
                    if (!stack.isEmpty()) {
                        bw.write(String.valueOf(stack.peek()));
                        bw.write("\n");
                    } else {
                        bw.write(String.valueOf(-1));
                        bw.write("\n");
                    }
                    break;
            }
        }

        bw.close();
    }
}
