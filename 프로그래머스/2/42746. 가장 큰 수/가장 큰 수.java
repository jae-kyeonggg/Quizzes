import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] ar = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            ar[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(ar, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2);
            }
        });
        if (ar[0].equals("0")) {
            return "0";
        }
        for (String str : ar) {
            sb.append(str);
        }
        return sb.toString();
    }
}