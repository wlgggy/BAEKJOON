import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] baskets = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            baskets[i] = i;
        }

        for (int m = 0; m < M; m++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            for (int i = 0; i < (end - start + 1) / 2; i++) {
                int temp = baskets[start + i];
                baskets[start + i] = baskets[end - i];
                baskets[end - i] = temp;
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}