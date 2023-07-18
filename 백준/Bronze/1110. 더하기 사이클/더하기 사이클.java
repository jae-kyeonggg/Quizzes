import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = A;
        for(int n = 1; n!=0; n++){
            B = (10*(B%10)) + ((B/10)+(B%10))%10;
            if(A == B) {
                System.out.print(n);
                break;
            }
        }
    }
}