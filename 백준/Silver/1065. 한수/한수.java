import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    int count = 0;
        for (int i = 1; i <= n; i++) {
            String val = String.valueOf(i);
            if (val.length() == 1 || val.length() == 2) {
                count += 1;
            } else if (val.length() == 3) {
                String[] values = val.split("");
                if (Integer.parseInt(values[1]) - Integer.parseInt(values[0]) == Integer.parseInt(values[2]) - Integer.parseInt(values[1])) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}