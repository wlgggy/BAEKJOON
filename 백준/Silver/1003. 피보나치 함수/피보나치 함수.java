import java.util.Scanner;

public class Main {
    static int[] fibZeroCount;
    static int[] fibOneCount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        calculateFibonacciCounts();

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            System.out.println(fibZeroCount[N] + " " + fibOneCount[N]);
        }
    }

    static void calculateFibonacciCounts() {
        fibZeroCount = new int[41];
        fibOneCount = new int[41];
        fibZeroCount[0] = 1;
        fibOneCount[1] = 1;

        for (int i = 2; i <= 40; i++) {
            fibZeroCount[i] = fibZeroCount[i - 1] + fibZeroCount[i - 2];
            fibOneCount[i] = fibOneCount[i - 1] + fibOneCount[i - 2];
        }
    }
}