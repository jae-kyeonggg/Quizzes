import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int month = Integer.valueOf(input.split(" ")[0]);
        int day = Integer.valueOf(input.split(" ")[1]);

        switch (month) {
            case 1:
            case 10:
                day += 0;
                break;
            case 5:
                day += 1;
                break;
            case 8:
                day += 2;
                break;
            case 2:
            case 3:
            case 11:
                day += 3;
                break;
            case 6:
                day += 4;
                break;
            case 9:
            case 12:
                day += 5;
                break;
            case 4:
            case 7:
                day += 6;
                break;
        }
        if (day >= 7) {
            day %= 7;
        }
        switch (day) {
            case 0:
                System.out.println("SUN");
                break;
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
        }

        sc.close();
    }
}