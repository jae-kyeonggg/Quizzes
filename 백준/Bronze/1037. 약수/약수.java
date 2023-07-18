import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        System.out.println(n % 2 == 1 ? (int) Math.pow(ar[n / 2], 2) : ar[0] * ar[n - 1]);
    }
}