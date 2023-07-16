import java.util.*;

public class Main {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   int K = sc.nextInt();
        System.out.println(fact(N) / fact(K) / fact(N - K));
    }
}