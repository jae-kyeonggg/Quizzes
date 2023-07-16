import java.util.*;

public class Main {
    public static int getDweller(int k, int n) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(i + 1);
        }
        int Dweller = 0;
        for (int j = 0; j < k; j++) {
            Dweller = 0;
            for (int i = 0; i < n; i++) {
                Dweller += ar.get(i);
                ar.set(i, Dweller);
            }
        }
        return Dweller;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] floor = new int[n];   int[] door = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();   int b = sc.nextInt();
            floor[i] = a;   door[i] = b;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(getDweller(floor[i], door[i]));
        }
    }
}