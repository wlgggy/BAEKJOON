import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int b = scanner.nextInt();

        long result = convert(n, b);
        System.out.println(result);
    }

    private static long convert(String n, int b) {
        long result = 0;
        int length = n.length();

        for (int i = 0; i < length; i++) {
            char digit = n.charAt(i);
            int value;

            if (Character.isDigit(digit)) {
                value = Character.getNumericValue(digit);
            } else {
                value = digit - 'A' + 10;
            }

            result += value * Math.pow(b, length - i - 1);
        }

        return result;
    }
}