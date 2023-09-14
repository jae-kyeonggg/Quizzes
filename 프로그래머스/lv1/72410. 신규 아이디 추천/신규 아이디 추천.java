import java.util.*;

class Solution {
    public static String solution(String new_id) {
        String answer = "";

        new_id = new_id.toLowerCase();
        answer = new_id.replaceAll("[^a-z0-9-_.]", "");
        answer = answer.replaceAll("\\.+", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");
        if (answer.isEmpty())
            answer = "a";
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }
        while (answer.length() <= 2)
            answer += answer.charAt(answer.length() - 1);

        return answer;
    }
}