class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double a = dots[0][0]; double b = dots[0][1]; double c = dots[1][0]; double d = dots[1][1];
        double e = dots[2][0]; double f = dots[2][1]; double g = dots[3][0]; double h = dots[3][1];
        
        if ((double)((d-b) / (c-a)) == (double)((h-f) / (g-e)))
            answer += 1;
        else if ((double)((f-b) / (e-a)) == (double)((h-d) / (g-c)))
            answer += 1;
        else if ((double)((h-b) / (g-a)) == (double)((f-d) / (e-c)))
            answer += 1;
        
        return answer;
    }
}