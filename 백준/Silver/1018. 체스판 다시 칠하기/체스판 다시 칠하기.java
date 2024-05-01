import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        int minRepaint = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minRepaint = Math.min(minRepaint, countRepaint(board, i, j));
            }
        }

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minRepaint = Math.min(minRepaint, countRepaintReverse(board, i, j));
            }
        }

        System.out.println(minRepaint);
        scanner.close();
    }

    static int countRepaint(char[][] board, int row, int col) {
        int repaint = 0;
        char startColor = 'W'; 
        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j++) {
                if (board[i][j] != startColor) {
                    repaint++;
                }
                startColor = (startColor == 'W') ? 'B' : 'W';
            }
            startColor = (startColor == 'W') ? 'B' : 'W';
        }
        return repaint;
    }

    static int countRepaintReverse(char[][] board, int row, int col) {
        int repaint = 0;
        char startColor = 'B';
        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j++) {
                if (board[i][j] != startColor) {
                    repaint++;
                }
                startColor = (startColor == 'W') ? 'B' : 'W';
            }
            startColor = (startColor == 'W') ? 'B' : 'W';
        }
        return repaint;
    }
}