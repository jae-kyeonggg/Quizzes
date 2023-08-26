import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   int m = sc.nextInt();   int[] ar = new int[n + 1];  ar[0] = 0;
        for (int i = 1; i <= n; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            ar[i] = ar[i - 1] + ar[i];
        }
        for (int a = 0; a < m; a++) {
            int i = sc.nextInt();   int j = sc.nextInt();
            System.out.println(ar[j] - ar[i - 1]);
        }
    }
}