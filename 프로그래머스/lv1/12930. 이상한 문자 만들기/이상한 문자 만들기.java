class Solution {
    public String solution(String s) {
        String answer = "";
        boolean odd = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                answer += s.charAt(i);
                odd = false;
                continue;
            } else {
                odd = !odd;
            }
            answer = (odd ? answer + (s.charAt(i) + "").toUpperCase() : answer + (s.charAt(i) + "").toLowerCase());
        }
        return answer;
    }
}