import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());  long y = Long.parseLong(st.nextToken());
        long z = 100 * y / x;
        if (z >= 99) {
            bw.write("-1");
        } else {
            long start = 0;     long end = 2000000000;
            while (start < end) {
                long mid = (start + end) / 2;
                long rate = 100 * (y + mid) / (x + mid);
                if (rate > z) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
            bw.write(String.valueOf(end));
        }
        bw.flush();
        bw.close();
    }
}