import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String[] xAr = X.split("");     String[] yAr = Y.split("");
        String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int[] xCount = new int[10];     int[] yCount = new int[10];
        for (int i = 0; i < xCount.length; i++) {
            for (int j = 0; j < xAr.length; j++) {
                if (nums[i].equals(xAr[j])) {
                    xCount[i] += 1;
                }
            }
        }
        for (int i = 0; i < yCount.length; i++) {
            for (int j = 0; j < yAr.length; j++) {
                if (nums[i].equals(yAr[j])) {
                    yCount[i] += 1;
                }
            }
        }
        int[] result = new int[10];
        for (int i = 0; i < 10; i++) {
            result[i] = Math.min(xCount[i], yCount[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < result[i]; j++) {
                sb.append(String.valueOf(i));
            }
        }
        if (sb.toString().equals("")) {
            return "-1";
        } else if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}