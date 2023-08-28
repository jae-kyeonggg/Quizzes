import java.util.*;

public class Main {
    public static boolean isPrime (int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                if (i != 1) {
                    System.out.println(i);
                }
            }
        }

    }
}