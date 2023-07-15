import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());        int m = Integer.parseInt(st.nextToken());
        int[] ar = new int[n];        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (ar[i] + ar[j] + ar[k] <= m) {
                        max = Math.max(ar[i] + ar[j] + ar[k], max);
                    }
                }
            }
        }
        System.out.println(max);
    }
}