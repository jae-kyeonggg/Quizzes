import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for (String s : keymap) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                map.put(ch, Math.min(i + 1, map.getOrDefault(ch, Integer.MAX_VALUE)));
            }
        }
        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                char key = targets[i].charAt(j);
                if (map.containsKey(key))
                    answer[i] += map.get(key);
                else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}