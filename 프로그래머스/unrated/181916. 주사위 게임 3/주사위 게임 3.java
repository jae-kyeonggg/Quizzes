import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] ar = {a, b, c, d};
        if (a == b && b == c && c == d) {
            return 1111 * a;
        } else if (a != b && a != c && a != d && b != c && b != d && c != d) {
            return Math.min(a, Math.min(b, Math.min(c, d)));
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : ar) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> key = new ArrayList<>(map.keySet());
        if (map.size() == 2) {
            if (map.get(key.get(0)) == 1 || map.get(key.get(1)) == 1) {
                int p = map.get(key.get(0)) == 3 ? key.get(0) : key.get(1);
                int q = map.get(key.get(0)) == 1 ? key.get(0) : key.get(1);
                return (int) Math.pow((10 * p) + q, 2);
            } else {
                return (key.get(0) + key.get(1)) * Math.abs(key.get(0) - key.get(1));
            }
        } else if (map.size() == 3) {
            int result = 0;
            for (Integer i : key) {
                if (map.get(i) != 2) {
                    if (result == 0) {
                        result = i;    
                    } else {
                        return i * result;
                    }
                } 
            }
        }
        return 0;
    }
}