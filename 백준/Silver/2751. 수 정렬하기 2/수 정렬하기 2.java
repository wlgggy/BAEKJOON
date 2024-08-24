import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // 숫자 배열 입력
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        StringBuilder result = new StringBuilder();
        for (int number : numbers) {
            result.append(number).append("\n");
        }
        System.out.print(result);
    }
}