import java.io.*;
import java.util.*;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());    dp = new int[n + 1];
        dp[0] = 1;  dp[1] = 2;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        bw.write(String.valueOf(dp[n - 1]));
        bw.flush();
    }
}