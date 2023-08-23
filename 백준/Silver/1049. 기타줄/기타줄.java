import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   int m = sc.nextInt();   int sum = 0;
        int[] pack = new int[m];    int[] piece = new int[m];
        for (int i = 0; i < m; i++) {
            pack[i] = sc.nextInt();     piece[i] = sc.nextInt();
        }
        Arrays.sort(pack);      Arrays.sort(piece);
        if (pack[0] * (n / 6) + piece[0] * (n % 6) >= pack[0] * ((n / 6) + 1)) {
            sum += pack[0] * ((n / 6) + 1);
        } else if (piece[0] * 6 <= pack[0]) {
            sum += piece[0] * n;
        } else {
            sum += pack[0] * (n / 6) + piece[0] * (n % 6);
        }
        System.out.println(sum);
    }
}