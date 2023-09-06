class Solution {
    public static int aliquot(int number, int limit, int power) {
        int result = 0;
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) result += 1;
            else if (number % i == 0) result += 2;
        }
        
        if (result > limit)
            return power;
        
        return result;
    }
    
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            answer += aliquot(i, limit, power);
        }
        
        return answer;
    }
}