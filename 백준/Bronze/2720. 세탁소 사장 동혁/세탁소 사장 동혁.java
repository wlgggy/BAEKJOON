import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int C = scanner.nextInt();
            calculateChange(C);
        }
    }

    private static void calculateChange(int cents) {
        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickels = cents / 5;
        cents %= 5;

        int pennies = cents;

        System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
    }
}
