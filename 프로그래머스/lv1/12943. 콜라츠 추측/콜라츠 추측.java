class Solution {
    public int solution(int num) {
        long n = num;
        int count = 0;
        while (n != 1) {
            n = (n % 2 == 0 ? n / 2 : (3 * n) + 1);
            count += 1;
            if (count == 500) {
                count = -1;
                break;
            }
        }
        return count;
    }
}