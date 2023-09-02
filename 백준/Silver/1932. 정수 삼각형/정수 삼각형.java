import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   int answer = 0;
        int[][] triangle = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = sc.nextInt();
            }
        }
        if (n == 1) {
            System.out.println(triangle[0][0]);
            return;
        }
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j == 0) triangle[i][j] += triangle[i - 1][j];
                else if (j == i) triangle[i][j] += triangle[i - 1][j - 1];
                else triangle[i][j] += Math.max(triangle[i - 1][j], triangle[i - 1][j - 1]);
                answer = Math.max(triangle[i][j], answer);
            }
        }
        System.out.println(answer);
    }
}