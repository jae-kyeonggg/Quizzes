class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        String num = String.valueOf(x) + "0";
        for (int i = 0; i < num.length() - 1; i++) {
            sum += Integer.parseInt(num.substring(i, i + 1));
        }
        
        answer = (x % sum == 0) ? true : false;
        
        return answer;
    }
}