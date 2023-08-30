import java.util.*;
import java.io.*;

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

        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            if (n == 1)
                System.out.println(1);
            else {
                int num1 = 0;   int num2 = 0;
                for (int i = 2; i <= n; i++) {
                    if (isPrime(i))
                        num1++;
                } for (int i = 2; i <= 2 * n; i++) {
                    if (isPrime(i))
                        num2++;
                }
                System.out.println(num2 - num1);
            }
        }

        sc.close();
    }
}