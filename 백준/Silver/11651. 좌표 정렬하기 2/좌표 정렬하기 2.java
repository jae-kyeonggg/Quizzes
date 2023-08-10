import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   int[][] ar = new int[n][2];
        for (int i = 0; i < n; i++) {
            ar[i][1] = sc.nextInt();   ar[i][0] = sc.nextInt();
        }
        Arrays.sort(ar, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i][1] + " " + ar[i][0]);
        }
    }
}