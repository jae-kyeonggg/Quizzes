import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();     String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String s : croatian) {
            str = str.replaceAll(s, "0");
        }
        bw.write(String.valueOf(str.length()));
        bw.flush();
    }
}