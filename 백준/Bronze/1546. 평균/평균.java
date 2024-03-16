import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
        }

        int maxScore = 0;
        for (int score : scores) {
            maxScore = Math.max(maxScore, score);
        }

        double sum = 0;
        for (int score : scores) {
            sum += (double)score / maxScore * 100;
        }
        double newAverage = sum / N;

        System.out.println(newAverage);
    }
}