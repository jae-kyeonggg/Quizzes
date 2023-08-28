import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int z = 0; z < t; z++) {
            int count = 0;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());   int[] a = new int[n + 1];
            int m = Integer.parseInt(st.nextToken());   int[] b = new int[m + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(b);
            for (int i = 0; i < n; i++) {
                count += binarySearch(b, a[i], 1, m);
            }
            bw.write(String.valueOf(count) + "\n");
        }

        bw.flush();
        bw.close();
    }
    static int binarySearch(int[] ar, int key, int left, int right) {
        int result = left - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (ar[mid] < key) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}