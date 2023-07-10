import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[]ar = new int[a];

        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            ar[i] = x + y;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        sc.close();
    }
}