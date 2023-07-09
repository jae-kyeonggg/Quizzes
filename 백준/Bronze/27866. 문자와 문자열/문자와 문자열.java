import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.next();   int n = sc.nextInt();

        System.out.println(input.charAt(n - 1));

        sc.close();
    }
}