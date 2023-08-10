import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());    int[] ar = new int[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(input[i]);
        }
        int S = Integer.parseInt(br.readLine());
        for (int i = 0; i < N - 1 && S > 0; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (j - i > S)  break;
                if (ar[j] > ar[maxIndex])   maxIndex = j;
            }
            for (int j = maxIndex; j > i; j--) {
                if (S > 0) {
                    int tmp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = tmp;
                    S--;
                }
            }
        }
        for (int i : ar) {
            sb.append(i).append(" ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
    }
}