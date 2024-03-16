import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int k = 0; k < M; k++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            exchangeBalls(baskets, i, j);
        }

        for (int ball : baskets) {
            System.out.print(ball + " ");
        }

        scanner.close();
    }

    public static void exchangeBalls(int[] baskets, int i, int j) {
        int temp = baskets[i - 1];
        baskets[i - 1] = baskets[j - 1];
        baskets[j - 1] = temp;
    }
}