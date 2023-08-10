import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    int count = 0;
        for (int i = 666; i < 2666800; i++) {
            if (String.valueOf(i).contains("666")) {
                count++;
                if (count == N) {
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}