import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        Character[] cha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String s = sc.next().toUpperCase();

        for (int i = 0; i < cha.length; i++) {
            map.put(cha[i], 0);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }

        int max = 0;
        for (int i = 0; i < cha.length; i++) {
            if (map.get(cha[i]) > max)
                max = map.get(cha[i]);
        }

        int count = 0;
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            if (value == max) {
                count++;
            }
        }
        if (count != 1)
            System.out.println("?");
        else {
            for (Character key : map.keySet()) {
                Integer value = map.get(key);
                if (value == max)
                    System.out.println(key);
            }
        }

        sc.close();
    }
}