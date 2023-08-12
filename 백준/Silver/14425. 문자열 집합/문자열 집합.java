import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<String> ar = new ArrayList<>();   int count = 0;
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); int m = Integer.parseInt(input[1]);
        for (int i = 0; i < n; i++) {
            ar.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                if (ar.get(j).equals(str)) {
                    count++;
                    break;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}