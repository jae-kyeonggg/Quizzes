import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = Integer.toString(i);
            String[] ar = s.split("");
            int sum = 0;
            for (int j = 0; j < ar.length; j++) {
                sum += Integer.parseInt(ar[j]);
            }
            if (i + sum == n) {
                System.out.println(i);
                break;
            }
            if (i == n - 1) {
                System.out.println(0);
            }
        }
    }
}
