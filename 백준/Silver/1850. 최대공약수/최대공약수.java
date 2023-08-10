import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        long a = Long.parseLong(input[0]);  long b = Long.parseLong(input[1]);
        for (int i = 0; i < gcd(Math.max(a, b), Math.min(a, b)); i++) {
            bw.write("1");
        }
        bw.flush();
    }
    static long gcd(long a, long b) {
        while (true) {
            long tmp = a % b;
            if (tmp == 0) return b;
            a = b;
            b = tmp;
        }
    }
}