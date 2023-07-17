import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   int k = Integer.parseInt(st.nextToken());
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ar.add(i);
            }
        }
        System.out.println(ar.size() < k ? 0 : ar.get(k - 1));
    }
}