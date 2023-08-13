import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());    Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.contains("push")) {
                deque.offer(Integer.parseInt(input.split(" ")[1]));
            } else if (input.equals("pop")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(deque.pollFirst()));
                    bw.newLine();
                }
            } else if (input.equals("size")) {
                bw.write(String.valueOf(deque.size()));
                bw.newLine();
            } else if (input.equals("empty")) {
                if (deque.isEmpty()) {
                    bw.write("1");
                    bw.newLine();
                }
                else {
                    bw.write("0");
                    bw.newLine();
                }
            } else if (input.equals("front")) {
                if (deque.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(deque.peekFirst()));
                    bw.newLine();
                }
            } else {
                if (deque.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(deque.peekLast()));
                    bw.newLine();
                }
            }
        }
        bw.flush();
    }
}