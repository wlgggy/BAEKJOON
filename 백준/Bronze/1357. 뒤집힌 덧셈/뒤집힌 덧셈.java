import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int reversedSum = reverseNumber(X) + reverseNumber(Y);

        System.out.println(reverseNumber(reversedSum));
    }

    private static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        return reversedNumber;
    }
}