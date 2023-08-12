import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());    String[] guitars = new String[n];
        for (int i = 0; i < n; i++) {
            guitars[i] = br.readLine();
        }
        Arrays.sort(guitars, (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            } else {
                int sum1 = 0;   int sum2 = 0;
                for (int i = 0; i < o1.length(); i++) {
                    if (o1.charAt(i) <= '9' && o1.charAt(i) >= '0') {
                        sum1 += Integer.parseInt(String.valueOf(o1.charAt(i)));
                    }
                }
                for (int i = 0; i < o2.length(); i++) {
                    if (o2.charAt(i) <= '9' && o2.charAt(i) >= '0') {
                        sum2 += Integer.parseInt(String.valueOf(o2.charAt(i)));
                    }
                }
                if (sum1 == sum2) {
                    return o1.compareTo(o2);
                } else {
                    return sum1 - sum2;
                }
            }
        });
        for (String guitar : guitars) {
            bw.write(guitar);
            bw.newLine();
        }
        bw.flush();
    }
}