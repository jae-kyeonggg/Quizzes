class Solution {
    public int[] solution(String s) {
        String[] str = s.split("");
        int[] result = new int[str.length];
        result[0] = -1;
        for (int i = 1; i < result.length; i++) {
            result[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (str[i].equals(str[j])) {
                    result[i] = i - j;
                    break;
                }
            }
        }
        return result;
    }
}