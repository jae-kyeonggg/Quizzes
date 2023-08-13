import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder("<");
        LinkedList<Integer> list = new LinkedList<>();
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); int k = Integer.parseInt(input[1]);
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int index = 0;
        while (n > 1) {
            index = (index + (k - 1)) % n;
            sb.append(list.remove(index)).append(", ");
            n -= 1;
        }
        sb.append(list.remove()).append(">");
        bw.write(sb.toString());
        bw.flush();
    }
}