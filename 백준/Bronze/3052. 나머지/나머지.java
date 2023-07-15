import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] ar = new int[10];

        for (int i = 0; i < 10; i++) {
            ar[i] = sc.nextInt() % 42;
        }
        ar = Arrays.stream(ar).distinct().toArray();

        System.out.println(ar.length);

        sc.close();
    }
}