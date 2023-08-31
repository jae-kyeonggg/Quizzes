import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();   int n = sc.nextInt();   int[] ar = new int[k];
        long max = 0;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
            max = Math.max(max, ar[i]);
        }
        long min = 1;
        while (min <= max) {
            long mid = (min + max) / 2;  long count = 0;
            for (int i = 0; i < ar.length; i++) {
                count += (ar[i] / mid);
            }
            if (count < n) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}