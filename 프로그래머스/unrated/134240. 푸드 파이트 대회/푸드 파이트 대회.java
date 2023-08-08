class Solution {
    public String solution(int[] food) {
        String answer = ""; String temp = "";
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer += String.valueOf(i);
            }
        }
        for (int i = 0; i < answer.length(); i++) {
            char ch = answer.charAt(i);
            temp = ch + temp;
        }
        return answer + "0" + temp;
    }
}