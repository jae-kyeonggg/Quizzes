import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int[][] ar = new int[30][30];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 30; i++) {
            ar[i][i] = 1;
            ar[i][0] = 1;
        }

        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                ar[i][j] = ar[i - 1][j - 1] + ar[i - 1][j];
            }
        }
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(ar[m][n]).append('\n');
        }

        System.out.println(sb);
    }
}