import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int m = sc.nextInt();   int[] input = new int[m];
        for (int i = 0; i < m; i++) {
            input[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            System.out.println(binarySearch(arr, input[i]));
        }
    }
    public static int binarySearch(int[] ar, int key) {
        int low = 0;
        int high = ar.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < ar[mid]) {
                high = mid - 1;
            } else if (key > ar[mid]) {
                low = mid + 1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}