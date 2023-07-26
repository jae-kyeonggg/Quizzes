import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int n = Integer.valueOf(nums[0]);   int m = Integer.valueOf(nums[1]);
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] keychain = br.readLine().split(" ");
            map.put(keychain[0], keychain[1]);
        }
        for (int i = 0; i < m; i++) {
            System.out.println(map.get(br.readLine()));
        }
    }
}