import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        String numbers = scanner.next();

        int sum = 0;
        for (int i = 0; i < N; i++) {

            sum += Character.getNumericValue(numbers.charAt(i));
        }

        System.out.println(sum);
    }
}