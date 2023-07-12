class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] ar = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            ar[num.length() - i - 1] = num.charAt(i) - '0';
        }
        return ar;
    }
}