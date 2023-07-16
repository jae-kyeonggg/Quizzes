import java.util.*;

public class Main {
    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   int count = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (isPrime(a) && a != 1) {
                count++;
            }
        }

        System.out.println(count);

    }
}