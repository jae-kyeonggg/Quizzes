import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        bw.write(String.valueOf(binarySearch(n)));
        bw.flush();
        bw.close();
    }
    static long binarySearch(long n) {
        long low = 0;   long high = n;  long result = 0;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (Math.pow(mid, 2) >= n) {
                high = mid - 1;
                result = mid;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}