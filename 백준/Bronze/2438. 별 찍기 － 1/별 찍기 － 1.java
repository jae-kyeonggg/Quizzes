import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            if (i != a) {
                System.out.println();
            }
        }

        sc.close();
    }
}