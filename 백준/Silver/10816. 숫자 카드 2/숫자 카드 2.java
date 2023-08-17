import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    int[] ar = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ar);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());
            sb.append(upperBound(ar, key) - lowerBound(ar, key)).append(' ');
        }
        System.out.println(sb);
    }
    static int lowerBound(int[] ar, int key) {
        int low = 0;    int high = ar.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (key <= ar[mid])
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
    static int upperBound(int[] ar, int key) {
        int low = 0;    int high = ar.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (key < ar[mid])
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}