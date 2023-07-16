import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String a = input.trim();
        if (!a.isEmpty()) {
            String[] ar = a.split(" ");
            System.out.println(ar.length);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}