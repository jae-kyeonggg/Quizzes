class Solution {
    public static String reverse(String input) {
        String output = "";     char c;
        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            output = c + output;
        }
        return output;
    }
    
    public int solution(int n) {
        int answer = 0;
        
        String triple = Integer.toString(n, 3);
        answer = Integer.parseInt(reverse(triple), 3);
        
        return answer;
    }
}