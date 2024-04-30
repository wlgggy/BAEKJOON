import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = getLastComputer(a, b);
            System.out.println(result);
        }
    }

    static int getLastComputer(int a, int b) {
 
        int[] cycle = {1, 1, 4, 4, 2, 1, 1, 4, 4, 2};
        int lastDigitOfA = a % 10;
        int remainder = b % cycle[lastDigitOfA];
        if (remainder == 0) remainder = cycle[lastDigitOfA];

        int result = 1;
        for (int i = 0; i < remainder; i++) {
            result *= a;
            result %= 10;
        }
        if (result == 0) result = 10;
        return result;
    }
}