import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        int interval = 45;

        if (h >= 1) {
            if (m < 45) {
                h -= 1;
                m += 15;
            } else {
                m -= interval;
            }
        } else {
            if (m < 45) {
                h = 23;
                m += 15;
            } else {
                m -= interval;
            }
        }

        System.out.println(h + " " + m);

        sc.close();
    }
}