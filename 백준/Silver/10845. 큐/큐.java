import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<String> queue = new LinkedList<>();  int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            String s = br.readLine();   String[] ar = s.split(" ");
            switch (ar[0]) {
                case "push":
                    queue.add(ar[1]);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        bw.write(String.valueOf(-1));
                        bw.write("\n");
                    } else {
                        bw.write(queue.poll());
                        bw.write("\n");
                    }
                    break;
                case "size":
                    bw.write(String.valueOf(queue.size()));
                    bw.write("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        bw.write(Integer.toString(1));
                        bw.write("\n");
                    } else {
                        bw.write(Integer.toString(0));
                        bw.write("\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        bw.write(Integer.toString(-1));
                        bw.write("\n");
                    } else {
                        bw.write(queue.peek());
                        bw.write("\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        bw.write(Integer.toString(-1));
                        bw.write("\n");
                    } else {
                        bw.write(((LinkedList<String>) queue).peekLast());
                        bw.write("\n");
                    }
                    break;
            }
        }

        bw.close();
    }
}
