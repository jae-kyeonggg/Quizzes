class Solution {
    public String solution(String s, int n) {
        String answer = "";     char ch;
        
        String[] array = new String[s.length()];
        for (int i = 0; i < s.length(); i++)
            array[i] = s.substring(i, i + 1);
        
        for (int i = 0; i < array.length; i++) {
            ch = s.charAt(i);
            if (ch != 32) {
                if (ch + n < 91) {
                    answer += String.valueOf((char)(ch + n));
                }
                else if (ch + n < 123 && ch + n > 97) {
                    if (ch < 91) {
                        answer += String.valueOf((char)(ch + n - 26));
                    } else {
                        answer += String.valueOf((char)(ch + n));
                    }
                }
                else {
                    answer += String.valueOf((char)(ch + n - 26));
                }
            } else {
                answer += String.valueOf((char)(ch));
            }
        }
        
        System.out.println(answer);
        
        return answer;
    }
}