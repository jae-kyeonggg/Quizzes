import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int x = 3; x <= 100; x++) {
            for (int i = 2; i <= x; i++) {
                for (int j = i; j <= x; j++) {
                    for (int k = j; k <= x; k++) {
                        if (x * x * x == k * k * k + j * j * j + i * i * i) {
                            bw.write("Cube = " + x + ", Triple = (" + i + "," + j + "," + k + ")\n");
                        }
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}