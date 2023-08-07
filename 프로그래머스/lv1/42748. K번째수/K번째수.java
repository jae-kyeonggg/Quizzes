import java.util.Arrays;

class Solution {
    public static int calc(int[] array, int[][] commands, int count) {
        int answer = 0;
        
        int[] split = Arrays.copyOfRange(array, commands[count][0] - 1, commands[count][1]);
        Arrays.sort(split);
        
        return split[commands[count][2] - 1];
    }
    
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        
        for (int i = 0; i < commands.length; i++) {
            answer[i] = calc(array, commands, count);
            count++;
        }
        
        return answer;
    }
}