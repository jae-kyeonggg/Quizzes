import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();

        loop:
        for (int z = 0; z < t; z++) {
            Deque<String> deque = new ArrayDeque<>();
            boolean isFront = true;
            String[] inputs = sc.next().split("");       int arLen = sc.nextInt();
            String num = sc.next();        String[] numArr = num.substring(1, num.length() - 1).split(",");
            for (String nums : numArr) {
                deque.offer(nums);
            }
            for (int i = 0; i < inputs.length; i++) {
                if (inputs[i].equals("R")) {
                    isFront = !isFront;
                    continue;
                }
                if (deque.size() == 0 || arLen == 0) {
                    sb.append("error").append("\n");
                    continue loop;
                }
                if (isFront) {
                    deque.pollFirst();
                    continue;
                }
                deque.pollLast();
            }
            sb.append("[");
            if (isFront) {
                deque.forEach(v -> {
                    sb.append(v).append(",");
                });
            } else {
                deque.descendingIterator().forEachRemaining(v -> {
                    sb.append(v).append(",");
                });
            }
            if (sb.charAt(sb.length() - 1) == ',')
                sb.deleteCharAt(sb.length() - 1);
            if (z != t - 1) {
                sb.append("]").append("\n");
            } else {
                sb.append("]");
            }
        }
        System.out.println(sb);
    }
}