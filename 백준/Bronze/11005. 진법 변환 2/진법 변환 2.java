import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        int B = scanner.nextInt();

        String result = convertToBaseB(N, B);
        System.out.println(result);
    }

    private static String convertToBaseB(long num, int base) {
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            long remainder = num % base;
            char digit;
            if (remainder < 10) {
                digit = (char) ('0' + remainder);
            } else {
                digit = (char) ('A' + remainder - 10);
            }

            result.insert(0, digit);
            num /= base;
        }

        return result.toString();
    }
}