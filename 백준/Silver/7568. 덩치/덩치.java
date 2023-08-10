import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());    int[][] ar = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            ar[i][0] = Integer.parseInt(input[0]);    ar[i][1] = Integer.parseInt(input[1]);
        }
        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (ar[i][0] < ar[j][0] && ar[i][1] < ar[j][1]) {
                    rank += 1;
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}