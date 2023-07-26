import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] value = br.readLine().split(" ");
        int n = Integer.parseInt(value[0]);     int m = Integer.parseInt(value[1]);
        int[] coin = new int[n];    int coins = 0;
        for (int i = 0; i < coin.length; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        while (m != 0) {
            for (int i = coin.length - 1; i >= 0; i--) {
                int quantity = m / coin[i];
                m -= quantity * coin[i];
                coins += quantity;
            }
        }
        System.out.println(coins);
    }
}
