import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] cards = new int[N][5];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                cards[i][j] = sc.nextInt();
            }
        }

        int winner = 0;
        int maxLastDigitSum = -1;

        for (int i = 0; i < N; i++) {
            int maxLastDigit = 0;

            for (int a = 0; a < 5; a++) {
                for (int b = a + 1; b < 5; b++) {
                    for (int c = b + 1; c < 5; c++) {
                        int sum = cards[i][a] + cards[i][b] + cards[i][c];
                        int lastDigit = sum % 10;

                        if (lastDigit > maxLastDigit) {
                            maxLastDigit = lastDigit;
                        }
                    }
                }
            }

            if (maxLastDigit >= maxLastDigitSum) {
                maxLastDigitSum = maxLastDigit;
                winner = i + 1;
            }
        }

        System.out.println(winner);
    }
}