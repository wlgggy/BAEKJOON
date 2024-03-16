import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();

            if (n == -1) {
                break;
            }

            if (isPerfectNumber(n)) {
                int[] divisors = getDivisors(n);
                System.out.print(n + " = ");
                for (int i = 0; i < divisors.length - 1; i++) {
                    System.out.print(divisors[i] + " + ");
                }
                System.out.println(divisors[divisors.length - 1]);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static int[] getDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] divisors = new int[count];
        int index = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                divisors[index++] = i;
            }
        }

        return divisors;
    }
}