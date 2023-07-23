import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (true) {
            int count = 0;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());   int m = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0) {
                break;
            }
            int[] sg = new int[n];  int[] sy = new int[m];
            for (int i = 0; i < n; i++) {
                sg[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < m; i++) {
                sy[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < m; i++) {
                count += (Arrays.binarySearch(sg, sy[i]) >= 0 ? 1 : 0);
            }
            bw.write(String.valueOf(count) + "\n");
        }
        bw.flush();
        bw.close();
    }
}