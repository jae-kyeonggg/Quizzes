import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   int begin = 1;  int i = 0;  int count = 1;
        while (true) {
            begin += (i * 6);
            if (begin >= a) {
                System.out.println(count);
                break;
            }
            count++;    i++;
        }
    }
}
