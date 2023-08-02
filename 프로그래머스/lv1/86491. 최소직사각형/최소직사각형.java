class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int maxWidth = 1;   int maxHeight = 1;
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }
        
        for (int i = 0; i < sizes.length; i++) {
            maxWidth = Math.max(maxWidth, sizes[i][0]);
            maxHeight = Math.max(maxHeight, sizes[i][1]);
        }
        
        return maxWidth * maxHeight;
    }
}