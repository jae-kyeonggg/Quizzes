import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] ar = new double[n];

        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            ar[i] = x;
        }

        Arrays.sort(ar);

        double max = ar[ar.length - 1];

        double sum = 0;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = ar[i] / max * 100;
            sum += ar[i];
        }

        System.out.println(sum / ar.length);

        sc.close();
    }
}