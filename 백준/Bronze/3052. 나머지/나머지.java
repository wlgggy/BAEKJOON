import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] remainders = new boolean[42];

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            int remainder = num % 42;
            remainders[remainder] = true;
        }

        int count = 0;
        for (boolean remainder : remainders) {
            if (remainder) count++;
        }

        System.out.println(count);
    }
}