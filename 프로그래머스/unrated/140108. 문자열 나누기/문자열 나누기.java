class Solution {
    public int solution(String s) {
        int answer = 0;  int index = 0;
        while (index < s.length()) {
            char c = s.charAt(index);
            int self = 1;
            int other = 0;
            while (index + 1 < s.length() && self != other) {
                index++;
                if(s.charAt(index) == c) self++;
                else other++;
            }
            answer++;
            index++;
        }
        return answer;
    }
}