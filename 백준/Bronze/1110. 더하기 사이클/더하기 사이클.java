import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int originalN = N;
        int cycleCount = 0;

        do {
            N = calculateNextNumber(N);
            cycleCount++;
        } while (N != originalN);

        System.out.println(cycleCount);
    }

    private static int calculateNextNumber(int number) {
        int sumOfDigits = (number / 10) + (number % 10);
        int newNumber = (number % 10) * 10 + (sumOfDigits % 10);
        return newNumber;
    }
}