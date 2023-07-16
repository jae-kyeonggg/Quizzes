import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int z = 0; z < n; z++) {
            int a = sc.nextInt();   int b = sc.nextInt();
            if (a % 10 == 0) {
                System.out.println(10);
            } else if (b % 4 == 0) {
                System.out.println((int) Math.pow(a, (b - 1) % 4 + 1) % 10);
            } else {
                System.out.println((int) Math.pow(a, b % 4) % 10);
            }
        }
    }
}