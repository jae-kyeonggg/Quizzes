import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());    int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ar);
        for (int i : ar) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}