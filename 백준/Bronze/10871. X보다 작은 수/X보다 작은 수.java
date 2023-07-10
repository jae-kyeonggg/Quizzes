import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   int X = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a < X)
                ar.add(a);
        }
        for (int i = 0; i < ar.size(); i++) {
            if (i != ar.size() - 1)
                System.out.print(ar.get(i) + " ");
            else
                System.out.print(ar.get(i));
        }

        sc.close();
    }
}