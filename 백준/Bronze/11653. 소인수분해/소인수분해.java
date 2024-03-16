import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n != 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    n /= i;
                    break;
                }
            }
        }
    }
}