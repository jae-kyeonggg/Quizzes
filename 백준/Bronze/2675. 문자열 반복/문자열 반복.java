import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();   String s = sc.next();   String output = "";
            String[] ar = new String[s.length()];
            for (int j = 0; j < ar.length; j++) {
                ar[j] = s.substring(j, j + 1);
            }
            for (int j = 0; j < ar.length; j++) {
                for (int k = 0; k < x; k++) {
                    output += ar[j];
                }
            }
            System.out.println(output);
        }

        sc.close();
    }
}