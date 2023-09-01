import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();   int m = sc.nextInt();   String s = sc.next();   int count = 0;
        sb.append("I");
        for (int i = 0; i < n; i++) {
            sb.append("OI");
        }
        for (int i = 0; i < m - 2 * n; i++) {
            if (s.substring(i, i + (2 * n + 1)).equals(sb.toString())) {
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}