import java.util.*;

public class Main {
    public static Long[] ar = new Long[101];
    public static long Padovan(int n) {
        if (ar[n] == null) {
            ar[n] = Padovan(n - 3) + Padovan(n - 2);
        }
        return ar[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ar[0] = 0L; ar[1] = 1L; ar[2] = 1L; ar[3] = 1L;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(Padovan(n));;
        }

        sc.close();
    }
}