import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);    int m = Integer.parseInt(nm[1]);
        char[][] plateB = chessPlateB();    char[][] plateW = chessPlateW();
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j);
            }
        }
        int minB = 2501;    int minY = 2501;     int bCount = 0;     int yCount = 0;
        for (int x = 0; x < n - 7; x++) {
            for (int y = 0; y < m - 7; y++) {
                bCount = 0;     yCount = 0;
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if (board[x + i][y + j] != plateB[i][j]) {
                            bCount++;
                        } else if (board[x + i][y + j] != plateW[i][j]) {
                            yCount++;
                        }
                    }
                }
                minB = Math.min(minB, bCount);
                minY = Math.min(minY, yCount);
            }
        }
        System.out.println(Math.min(minB, minY));
    }
    static char[][] chessPlateB() {
        char[][] chessPlateB = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessPlateB[i][j] = (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) ? 'B' : 'W';
            }
        }
        return chessPlateB;
    }
    static char[][] chessPlateW() {
        char[][] chessPlateW = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessPlateW[i][j] = (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) ? 'W' : 'B';
            }
        }
        return chessPlateW;
    }
}
