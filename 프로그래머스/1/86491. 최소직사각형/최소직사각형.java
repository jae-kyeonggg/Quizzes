class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }
        for (int i = 0; i < sizes.length; i++) {
            maxW = Math.max(sizes[i][0], maxW);
            maxH = Math.max(sizes[i][1], maxH);
        }
        return maxW * maxH;
    }
}