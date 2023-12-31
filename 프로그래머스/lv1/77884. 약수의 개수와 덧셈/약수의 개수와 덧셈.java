class Solution {
    public static int aliquot(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) 
                count++;
        }
        return count;
    }
    
    public int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum = aliquot(i) % 2 == 0 ? sum + i : sum - i;
        }
        return sum;
    }
}