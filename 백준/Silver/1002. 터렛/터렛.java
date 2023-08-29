import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int z = 0; z < t; z++) {
            String[] axis = br.readLine().split(" ");
            int x1 = Integer.parseInt(axis[0]); int y1 = Integer.parseInt(axis[1]); int r1 = Integer.parseInt(axis[2]);
            int x2 = Integer.parseInt(axis[3]); int y2 = Integer.parseInt(axis[4]); int r2 = Integer.parseInt(axis[5]);
            bw.write(point(x1, y1, r1, x2, y2, r2));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    public static String point(int x1, int y1, int r1, int x2, int y2, int r2) {
        double diff = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return "-1";
        } else if (diff > Math.pow(r1 + r2, 2)) {
            return "0";
        } else if (diff < Math.pow(r1 - r2, 2)) {
            return "0";
        } else if (diff == Math.pow(r1 + r2, 2)) {
            return "1";
        } else if (diff == Math.pow(r1 - r2, 2)) {
            return "1";
        } else {
            return "2";
        }
    }
}