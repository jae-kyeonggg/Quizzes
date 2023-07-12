class Solution {
    boolean solution(String s) {
        boolean answer = false;  int pcount = 0; int ycount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) + 0 == 112 || s.charAt(i) + 0 == 80)    pcount += 1;
            else if (s.charAt(i) + 0 == 121 || s.charAt(i) + 0 == 89)   ycount += 1;
        }
        answer = (pcount == ycount ? true : false);

        return answer;
    }
}