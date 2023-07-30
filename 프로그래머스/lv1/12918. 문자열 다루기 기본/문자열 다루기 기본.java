class Solution {
    public boolean solution(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9' || (s.length() != 4 && s.length() != 6))
                return false;
        }
        return true;
    }
}