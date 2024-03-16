import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 1;
        int range = 1;

        while (range < N) {
            range += 6 * count;
            count++;
        }

        System.out.println(count);
    }
}