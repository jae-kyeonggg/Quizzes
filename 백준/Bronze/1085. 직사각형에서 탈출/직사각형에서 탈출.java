import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());   int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());   int h = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(Math.min(Math.min(Math.abs(x - w), Math.abs(y - h)), Math.min(x, y))));
        bw.flush();
        bw.close();
    }
}