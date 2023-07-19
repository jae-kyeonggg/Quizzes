import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(br.readLine());    int x = 0;
        boolean[] check = new boolean[21];
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            if (!command.equals("all") && !command.equals("empty")) {
                x = Integer.parseInt(st.nextToken());
            }
            switch (command) {
                case "add":
                    check[x] = true;    break;
                case "remove":
                    check[x] = false;   break;
                case "check":
                    bw.write(check[x] ? "1" : "0");
                    bw.newLine();
                    break;
                case "toggle":
                    check[x] = !check[x];
                    break;
                case "all":
                    Arrays.fill(check, true);
                    break;
                case "empty":
                    Arrays.fill(check, false);
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}