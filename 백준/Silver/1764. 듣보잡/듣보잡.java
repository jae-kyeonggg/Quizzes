import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());   int b = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hash = new HashMap<>();
        for (int i = 0; i < a; i++)
            hash.put(br.readLine(), 1);
        ArrayList<String> ar = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            String name = br.readLine();
            if (hash.containsKey(name)) {
                ar.add(name);
            }
        }
        Collections.sort(ar);
        bw.write(ar.size() + "\n");
        for (int i = 0; i < ar.size(); i++) {
            bw.write(ar.get(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}