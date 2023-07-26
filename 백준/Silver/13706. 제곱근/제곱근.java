import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger n = new BigInteger(br.readLine());
        bw.write(String.valueOf(binarySearch(n)));
        bw.flush();
        bw.close();
    }
    static BigInteger binarySearch(BigInteger n) {
        BigInteger low = new BigInteger("1");
        BigInteger mid;
        BigInteger high = n;
        while (true) {
            mid = low.add(high).divide(BigInteger.TWO);
            int result = mid.multiply(mid).compareTo(n);
            if (result == 0) break;
            else if (result == 1) high = mid.subtract(BigInteger.ONE);
            else low = mid.add(BigInteger.ONE);
        }
        return mid;
    }
}