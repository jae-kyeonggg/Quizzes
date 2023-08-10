import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    String str = sc.nextLine();     String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
            answer += (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ? String.valueOf(str.charAt(i)).toUpperCase() : String.valueOf(str.charAt(i)).toLowerCase());
        System.out.println(answer);
    }
}