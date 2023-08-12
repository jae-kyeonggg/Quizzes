import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();   int[] ar = new int[10];
        for (int i = 0; i < n.length(); i++) {
            int num = n.charAt(i) - '0';
            if (num == 6) {
                ar[9]++;
            } else {
                ar[num]++;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, ar[i]);
        }
        int nine = ar[9] % 2 == 0 ? ar[9] / 2 : ar[9] / 2 + 1;
        bw.write(String.valueOf(Math.max(max, nine)));
        bw.flush();
    }
}