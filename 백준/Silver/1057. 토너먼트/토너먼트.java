import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   int a = sc.nextInt();   int b = sc.nextInt();
        System.out.println(Integer.toBinaryString((a - 1) ^ (b - 1)).length());
    }
}