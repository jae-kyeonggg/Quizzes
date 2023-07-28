class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int num = 0;
        for (int i = 0; i < signs.length; i++) {
            num = (signs[i] == true) ? (absolutes[i]) : (-absolutes[i]);
            answer += num;
        }
        
        return answer;
    }
}