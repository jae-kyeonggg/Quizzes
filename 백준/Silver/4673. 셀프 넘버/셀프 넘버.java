import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            ar.add(i + 1);
        }

        for (int i = 1; i < 10001; i++) {
            if (i < 10) {
                ar.remove(Integer.valueOf(i + i));
            } else if (i >= 10 && i < 100) {
                int a = i / 10;
                int b = i - a * 10;
                ar.remove(Integer.valueOf(a + b + i));
            } else if (i >= 100 && i < 1000) {
                int a = i / 100;
                int b = (i - a * 100) / 10;
                int c = i - a * 100 - b * 10;
                ar.remove(Integer.valueOf(a +  b + c + i));
            } else if (i >= 1000 && i < 10000) {
                int a = i / 1000;
                int b = (i - a * 1000) / 100;
                int c = (i - a * 1000 - b * 100) / 10;
                int d = i - a * 1000 - b * 100 - c * 10;
                ar.remove(Integer.valueOf(a  + b  + c + d + i));
            }
        }

        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }

    }
}