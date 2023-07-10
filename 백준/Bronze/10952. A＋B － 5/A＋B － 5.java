import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> ar = new ArrayList<>();

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0)
                break;
            ar.add(a + b);
        }

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        sc.close();
    }
}