import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        int rt = 0, cf = 0, jm = 0, an = 0;
        for (int i = 0; i < survey.length; i++) {
            int score = 0;
            switch(choices[i]) {
                case 1: score = -3; break;
                case 2: score = -2; break;
                case 3: score = -1; break;
                case 4: score = 0; break;
                case 5: score = 1; break;
                case 6: score = 2; break;
                case 7: score = 3; break;
            }
            switch(survey[i]) {
                case "RT":  rt += score;    break;
                case "TR":  rt -= score;    break;
                case "CF":  cf += score;    break;
                case "FC":  cf -= score;    break;
                case "JM":  jm += score;    break;
                case "MJ":  jm -= score;    break;
                case "AN":  an += score;    break;
                case "NA":  an -= score;    break;
            }
        }
        sb.append(rt <= 0 ? "R" : "T").append(cf <= 0 ? "C" : "F").append(jm <= 0 ? "J" : "M").append(an <= 0 ? "A" : "N");
        return sb.toString();
    }
}