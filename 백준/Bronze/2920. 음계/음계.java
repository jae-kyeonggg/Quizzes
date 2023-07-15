import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] ar = new int[8];
        for (int i = 0; i < 8; i++) {
            ar[i] = sc.nextInt();
        }

        String order = "";

        for (int i = 0; i < 7; i++) {
            if (ar[i] + 1 == ar[i + 1])
                order = "ascending";
            else if (ar[i] - 1 == ar[i + 1])
                order = "descending";
            else {
                order = "mixed";
                System.out.println(order);
                return;
            }
        }

        System.out.println(order);

        sc.close();
    }
}