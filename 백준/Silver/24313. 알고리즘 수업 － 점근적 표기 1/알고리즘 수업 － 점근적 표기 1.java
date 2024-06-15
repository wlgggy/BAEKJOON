import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int a0 = scanner.nextInt();
        int c = scanner.nextInt();
        int n0 = scanner.nextInt();

        boolean satisfied = true;
        for (int n = n0; n <= 100; n++) {
            int f_n = a1 * n + a0;
            int c_times_g_n = c * n;

            if (f_n > c_times_g_n) {
                satisfied = false;
                break;
            }
        }

        if (satisfied) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}