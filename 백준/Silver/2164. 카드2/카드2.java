import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            bw.write(Integer.toString(1));
            bw.close();
            return;
        }
        for (int i = 0; i < N; i++) {
            queue.add(i + 1);
        }
        while (true) {
            queue.poll();
            int x = queue.poll();
            queue.add(x);
            if (queue.size() == 1) {
                bw.write(Integer.toString(queue.poll()));
                break;
            }
        }

        bw.close();

    }
}
