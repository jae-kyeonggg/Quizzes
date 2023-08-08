class Solution {
    public int solution(int a, int b, int n) {
        int count = 0;
        do {
            int coke = n / a;
            count += coke * b;
            n -= (coke * a);
            n += (coke * b);
        } while (n >= a);
        return count;
    }
}