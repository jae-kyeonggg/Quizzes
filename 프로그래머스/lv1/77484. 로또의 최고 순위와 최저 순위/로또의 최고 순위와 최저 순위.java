class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];  int count = 0;  int zeroCount = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
            }
        }
        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[j] == win_nums[i]) {
                    count++;
                    break;
                }
            }
        }
        switch (count) {
            case 6:
                answer[0] = 1;  answer[1] = answer[0] - zeroCount;
                break;
            case 5:
                answer[1] = 2;  answer[0] = answer[1] - zeroCount;
                break;
            case 4:
                answer[1] = 3;  answer[0] = answer[1] - zeroCount;
                break;
            case 3:
                answer[1] = 4;  answer[0] = answer[1] - zeroCount;
                break;
            case 2:
                answer[1] = 5;  answer[0] = answer[1] - zeroCount;
                break;
            default:
                if (zeroCount == 6) {
                    answer[1] = 6;  answer[0] = 1;  break;
                }
                answer[1] = 6;  answer[0] = answer[1] - zeroCount;
                break;
        }
        return answer;
    }
}