import java.util.*;

public class Main {
    static int[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   int m = sc.nextInt();   int v = sc.nextInt();
        int[][] graphs = new int[n + 1][n + 1];
        visited = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();   int b = sc.nextInt();
            graphs[a][b] = 1;
            graphs[b][a] = 1;
        }
        DFS(n, v, graphs);
        System.out.println();
        visited = new int[n + 1];
        BFS(n, v, graphs);
    }
    public static void DFS(int n, int vertex, int[][] graphs) {
        visited[vertex] = 1;
        System.out.print(vertex + " ");
        for (int i = 1; i <= n; i++) {
            if (graphs[vertex][i] == 1 && visited[i] == 0) {
                DFS(n, i, graphs);
            }
        }
    }

    public static void BFS(int n, int vertex, int[][] graphs) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        visited[vertex] = 1;
        while (!queue.isEmpty()) {
            int c = queue.poll();
            System.out.print(c + " ");
            for (int i = 1; i <= n; i++) {
                if (graphs[c][i] == 1 && visited[i] == 0) {
                    queue.add(i);
                    visited[i] = 1;
                }
            }
        }
    }
}