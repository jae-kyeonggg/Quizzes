import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int Aplus = 0;
            int a = sc.nextInt();
            int sum = 0;
            int[] ar = new int[a];
            for (int x = 0; x < a; x++) {
                ar[x] = sc.nextInt();
                sum += ar[x];
            }
            for (int x = 0; x < ar.length; x++) {
                if (ar[x] > sum / ar.length)
                    Aplus++;
            }
            System.out.printf("%.3f", ((float) Aplus / (float) ar.length) * 100);
            System.out.print("%\n");
        }

        sc.close();
    }
}