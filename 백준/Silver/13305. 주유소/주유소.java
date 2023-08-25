import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] distance = new long[n - 1];  long[] price = new long[n];
        for (int i = 0; i < n - 1; i++) {
            distance[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextLong();
        }
        long sum = 0;
        long min = price[0];
        for (int i = 0; i < n - 1; i++) {
            if (price[i] < min) {
                min = price[i];
            }
            sum += min * distance[i];
        }
        System.out.println(sum);
    }
}