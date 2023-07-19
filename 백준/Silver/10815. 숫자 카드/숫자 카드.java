import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());    int[] cards = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);
        int m = Integer.parseInt(br.readLine());    int[] nums = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < nums.length; i++) {
            sb.append(Arrays.binarySearch(cards, nums[i]) >= 0 ? "1 " : "0 ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}