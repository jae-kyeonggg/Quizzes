import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());        Deque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front":
                    deque.offerFirst(st.nextToken());
                    break;
                case "push_back":
                    deque.offerLast(st.nextToken());
                    break;
                case "pop_front":
                    String n = deque.pollFirst();
                    System.out.println(n == null ? -1 : n);
                    break;
                case "pop_back":
                    String x = deque.pollLast();
                    System.out.println(x == null ? -1 : x);
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    System.out.println(deque.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    String z = deque.peekFirst();
                    System.out.println(z == null ? -1 : z);
                    break;
                case "back":
                    String p = deque.peekLast();
                    System.out.println(p == null ? -1 : p);
                    break;
            }
        }
    }
}