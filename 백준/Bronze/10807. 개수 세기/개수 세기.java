import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();

        int count_v = 0;
        for (int i = 0; i < N; i++) {
            if (numbers[i] == v) {
                count_v++;
            }
        }
        System.out.println(count_v);
    }
}