import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);     int b = Integer.parseInt(input[1]);

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> ar = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String s = br.readLine();
            map.put(s, i + 1);
            ar.add(s);
        }
        for (int i = 0; i < b; i++) {
            String s = br.readLine();
            if (s.charAt(0) >= 48 && s.charAt(0) <= 57) {
                bw.write(ar.get(Integer.parseInt(s) - 1) + '\n');
            } else {
                bw.write(String.valueOf(map.get(s)) + '\n');
            }
        }
        bw.close();
    }
}