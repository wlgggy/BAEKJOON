import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        System.out.println(findFraction(x));
    }

    private static String findFraction(int x) {
        int line = 1;
        int numerator = 1;
        int denominator = 1;

        while (x > line) {
            x -= line;
            line++;
        }

        if (line % 2 == 0) {
            numerator = x;
            denominator = line - x + 1;
        } else {
            numerator = line - x + 1;
            denominator = x;
        }

        return numerator + "/" + denominator;
    }
}