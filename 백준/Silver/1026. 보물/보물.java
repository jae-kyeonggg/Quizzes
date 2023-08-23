import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   int sum = 0;
        int[] a = new int[n];   Integer[] b = new Integer[n];
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) a[i] = sc.nextInt();
            else b[i - n] = sc.nextInt();
        }
        Arrays.sort(a);     Arrays.sort(b, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            sum += a[i] * b[i];
        }
        System.out.println(sum);
    }
}