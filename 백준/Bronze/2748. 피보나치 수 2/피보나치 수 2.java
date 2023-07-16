import java.util.*;

public class Main {
    public static long fibonacci(int n) {
        long[] ar = new long[n + 1];
        ar[0] = 0;  ar[1] = 1;
        for (int i = 2; i < n + 1; i++)
            ar[i] = ar[i - 1] + ar[i - 2];
        return ar[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fibonacci(n));

        sc.close();
    }
}