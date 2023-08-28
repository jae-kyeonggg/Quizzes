import java.io.*;
import java.util.*;

public class Main {
    static int[] visited;
    static ArrayList<String> computer = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   int m = sc.nextInt();
        visited = new int[n + 1];
        int[][] graphs = new int[n + 1][n + 1];     int[][] ar = new int[m][2];
        for (int i = 0; i < m; i++) {
            ar[i][0] = sc.nextInt();   ar[i][1] = sc.nextInt();
        }
        Arrays.sort(ar, Comparator.comparingInt(o -> o[0]));
        for (int i = 0; i < m; i++) {
            graphs[ar[i][0]][ar[i][1]] = 1;   graphs[ar[i][1]][ar[i][0]] = 1;
        }
        DFS(n, 1, graphs);
        System.out.println(computer.size() - 1);
    }
    public static void DFS(int n, int vertex, int[][] graphs) {
        visited[vertex] = 1;
        for (int i = 1; i <= n; i++) {
            if (graphs[vertex][i] == 1 && visited[i] == 0) {
                DFS(n, i, graphs);
            }
        }
        computer.add(String.valueOf(vertex));
    }
}