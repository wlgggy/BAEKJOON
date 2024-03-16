import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] baskets = new int[N];

        for (int m = 0; m < M; m++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for (int idx = i - 1; idx < j; idx++) {
                baskets[idx] = k;
            }
        }

        for (int num : baskets) {
            System.out.print(num + " ");
        }
    }
}