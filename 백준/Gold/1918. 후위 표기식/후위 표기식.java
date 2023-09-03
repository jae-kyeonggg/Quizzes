import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<String> stack = new Stack<>();        String s = br.readLine();
        ArrayList<String> postfix = new ArrayList<>();  int i = 0;  int index = 0;
        String[] ar = s.split("");  String op;
        for (i = 0; i < ar.length; i++) {
            switch (ar[i]) {
                case "+":
                case "-":
                case "*":
                case "/":
                    while (!stack.isEmpty() && (rank(ar[i]) <= rank(stack.peek()))) {
                        postfix.add(stack.peek());
                        stack.pop();
                    }
                    stack.push(ar[i]);
                    break;
                case "(":
                    stack.push(ar[i]);
                    break;
                case ")":
                    op = stack.pop();
                    while (!op.equals("(")) {
                        postfix.add(op);
                        op = stack.pop();
                    }
                    break;
                default:
                    postfix.add(ar[i]);
                    break;
            }
        }
        while (!stack.isEmpty()) {
            op = stack.peek();
            stack.pop();
            postfix.add(op);
        }
        String returns = "";
        for (int x = 0; x < postfix.size(); x++) {
            returns += postfix.get(x);
        }
        bw.write(returns);

        bw.close();
    }
    public static int rank (String op) {
        switch (op) {
            case "(":
            case ")":
                return 0;
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
        }
        return -1;
    }
}
