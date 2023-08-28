import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int z = 0; z < t; z++) {
            HashMap<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());    int result = 1;
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String cloth = st.nextToken();
                if (map.containsKey(cloth)) {
                    map.put(cloth, map.get(cloth) + 1);
                } else {
                    map.put(cloth, 1);
                }
            }
            for (int i : map.values()) {
                result *= (i + 1);
            }
            System.out.println(result - 1);
        }
    }
}