import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] ar = new int[a];
        int[] xr = new int[a];
        int[] yr = new int[a];

        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            xr[i] = x;
            yr[i] = y;
            ar[i] = x + y;
        }

        for (int i = 0; i < a; i++) {
            System.out.println("Case #" + (i + 1) + ": " + xr[i] + " + " + yr[i] + " = " + ar[i]);
        }

        sc.close();
    }
}