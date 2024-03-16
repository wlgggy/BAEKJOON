import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();

        long sum = 0;
        long i = 1;

        while (sum + i <= S) {
            sum += i;
            i++;
        }

        System.out.println(i - 1);
    }
}