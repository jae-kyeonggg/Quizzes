import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   int b = sc.nextInt();   int v = sc.nextInt();

        int n = (v - a + (a - b)) / (a - b);           int t = (v - a + (a - b)) % (a - b);

        System.out.println(t == 0 ? n : n + 1);

        sc.close();
    }
}