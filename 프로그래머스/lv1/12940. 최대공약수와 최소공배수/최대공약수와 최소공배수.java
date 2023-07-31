class Solution {
    public static int gcd(int n, int m) {
        int gcd = 0;
        for (int i = 1; i <= ((n < m) ? n : m); i++) {
            if (n % i == 0 && m % i == 0)
                gcd = i;
        }
        return gcd;
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = (n * m) / gcd(n, m);
        return answer;
    }
}