import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   int[] ar = new int[a];
        for (int i = 0; i < a; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum += ar[j];
            }
        }
        System.out.println(sum);
    }
}