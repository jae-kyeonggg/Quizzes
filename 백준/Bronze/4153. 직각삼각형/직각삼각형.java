import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int[] ar = new int[3];
            for (int i = 0; i < 3; i++) {
                ar[i] = sc.nextInt();
            }
            if (ar[0] == 0 && ar[1] == 0 && ar[2] == 0)
                break;
            Arrays.sort(ar);
            if (Math.pow(ar[0], 2) + Math.pow(ar[1], 2) == Math.pow(ar[2], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
