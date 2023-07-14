import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] ar = new int[9];  int max = 0;    int maxI = 0;

        for (int i = 0; i < 9; i++) {
            ar[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (ar[i] > max) {
                max = ar[i];
                maxI = i;
            }
        }

        System.out.println(max);
        System.out.println(maxI + 1);

        sc.close();
    }
}