import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] a = br.readLine().split(" ");  String[] b = br.readLine().split(" ");
        int sonA = Integer.parseInt(a[0]);  int motherA = Integer.parseInt(a[1]);
        int sonB = Integer.parseInt(b[0]);  int motherB = Integer.parseInt(b[1]);
        int son = motherA * sonB + motherB * sonA;  int mother = motherA * motherB;
        int gcd = gcd(son, mother);
        bw.write(String.valueOf(son / gcd) + " " + String.valueOf(mother / gcd));
        bw.flush();
    }
    static int gcd(int a, int b) {
        int answer = 0;
        while (b != 0) {
            answer = a % b;
            a = b;
            b = answer;
        }
        return a;
    }
}