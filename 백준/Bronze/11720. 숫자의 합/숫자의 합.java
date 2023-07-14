import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   String input = sc.next();   int sum = 0;
        String[] ar = input.split("");

        for (int i = 0; i < a; i++) {
            sum += Integer.valueOf(ar[i]);
        }

        System.out.println(sum);

        sc.close();
    }
}