import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int result = fibonacci(n);

            System.out.println(result);
        }

        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                int[] fibArray = new int[n + 1];
                fibArray[0] = 0;
                fibArray[1] = 1;

                for (int i = 2; i <= n; i++) {
                    fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
                }

                return fibArray[n];
            }
        }
    }