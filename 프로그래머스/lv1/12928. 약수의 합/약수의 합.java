class Solution {
    public int solution(int n) {
        int sum = 0;       
        for (int i = 1; i <= n; i++) {
            sum += (n % i == 0 ? i : 0);
        }
        return sum;
    }
}