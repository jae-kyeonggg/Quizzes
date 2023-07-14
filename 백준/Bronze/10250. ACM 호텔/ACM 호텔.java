import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tasks = sc.nextInt();

        for (int i = 0; i < tasks; i++) {
            int H = sc.nextInt();   int W = sc.nextInt();   int N = sc.nextInt();
            int floor = N % H;      int room = N / H;
            if (floor == 0)
                System.out.println(H * 100 + room);
            else
                System.out.println(floor * 100 + room + 1);
        }

        sc.close();
    }
}