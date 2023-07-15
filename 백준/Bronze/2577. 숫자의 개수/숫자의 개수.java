import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ar = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int a = sc.nextInt();   int b = sc.nextInt();   int c = sc.nextInt();

        String n = Integer.valueOf(a * b * c).toString();

        for (int i = 0; i < n.length(); i++) {
            if (n.substring(i, i + 1).equals("0"))
                ar[0]++;
            else if (n.substring(i, i + 1).equals("1"))
                ar[1]++;
            else if (n.substring(i, i + 1).equals("2"))
                ar[2]++;
            else if (n.substring(i, i + 1).equals("3"))
                ar[3]++;
            else if (n.substring(i, i + 1).equals("4"))
                ar[4]++;
            else if (n.substring(i, i + 1).equals("5"))
                ar[5]++;
            else if (n.substring(i, i + 1).equals("6"))
                ar[6]++;
            else if (n.substring(i, i + 1).equals("7"))
                ar[7]++;
            else if (n.substring(i, i + 1).equals("8"))
                ar[8]++;
            else if (n.substring(i, i + 1).equals("9"))
                ar[9]++;
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        sc.close();
    }
}