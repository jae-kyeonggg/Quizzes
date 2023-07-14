import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] ar = new int[a];

        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            ar[i] = x;
        }

        Arrays.sort(ar);

        System.out.println(ar[0] + " " + ar[ar.length - 1]);

        sc.close();
    }
}