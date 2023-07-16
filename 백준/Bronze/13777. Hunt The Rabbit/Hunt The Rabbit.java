import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            binarySearch(n, 1, 50);
            System.out.println();
        }
    }
    static int binarySearch(int key, int low, int high) {
        int mid;
        if (low <= high) {
            mid = (low + high) / 2;
            System.out.print(mid + " ");
            if (key == mid) {
                return mid;
            } else if (key < mid) {
                return binarySearch(key, low, mid - 1);
            } else {
                return binarySearch(key, mid + 1, high);
            }
        }
        return -1;
    }
}