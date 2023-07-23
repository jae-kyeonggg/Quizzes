import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   int count = 0;
        if (a == 0) {
            System.out.println(0);
            return;
        }
        for (int i = 1; i < a + 1; i++) {
            int temp = i;
            while (temp % 5 == 0) {
                count++;
                temp /= 5;
            }
        }
        System.out.println(count);
        sc.close();
    }
}