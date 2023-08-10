import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayList<String> ar1 = new ArrayList<>();
        ArrayList<String> ar2 = new ArrayList<>();
        for (String s : goal) {
            ar1.add(s);     ar2.add(s);
        }
        for (int i = 0; i < cards2.length; i++) {
            for (int j = 0; j < ar1.size(); j++) {
                if (ar1.get(j).equals(cards2[i])) {
                    ar1.remove(j);
                }
            }
        }
        for (int i = 0; i < cards1.length; i++) {
            for (int j = 0; j < ar2.size(); j++) {
                if (ar2.get(j).equals(cards1[i])) {
                    ar2.remove(j);
                }
            }
        }
        for (int i = 0; i < Math.min(ar1.size(), cards1.length); i++) {
            if (!cards1[i].equals(ar1.get(i))) {
                return "No";
            }
        }
        for (int i = 0; i < Math.min(ar2.size(), cards2.length); i++) {
            if (!cards2[i].equals(ar2.get(i))) {
                return "No";
            }
        }
        return "Yes";
    }
}