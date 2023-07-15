import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Character[] charA = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        String s = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < charA.length; i++) {
            map.put(charA[i], -1);
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = 0; j < charA.length; j++) {
                if (s.charAt(i) == charA[j]) {
                    map.replace(s.charAt(i), i);
                }
            }
        }
        for (int i = 0; i < map.size(); i++) {
            System.out.print(map.get(charA[i]));
            if (i != map.size() - 1)
                System.out.print(" ");
        }

        sc.close();
    }
}