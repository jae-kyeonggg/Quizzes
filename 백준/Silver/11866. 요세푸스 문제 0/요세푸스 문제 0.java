import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();     sb.append("<");
        int n = Integer.parseInt(st.nextToken());   int m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }
        while (!queue.isEmpty()) {
            for (int i = 0; i < m - 1; i++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll()).append(queue.size() != 0 ? ", " :  "");
        }
        sb.append(">");
        System.out.println(sb);
    }
}
