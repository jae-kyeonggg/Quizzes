import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   int b = sc.nextInt();

        int x = (a % 10) * 100 + (a - (a / 100) * 100) / 10 * 10 + (a / 100);
        int y = (b % 10) * 100 + (b - (b / 100) * 100) / 10 * 10 + (b / 100);

        System.out.println(x > y ? x : y);

        sc.close();
    }
}