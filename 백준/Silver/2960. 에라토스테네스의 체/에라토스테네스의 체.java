import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int result = findKthPrime(n, k);
        System.out.println(result);

        scanner.close();
    }

    public static int findKthPrime(int n, int k) {
        boolean[] isNotPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            if (!isNotPrime[i]) {
                k--;

                if (k == 0) {
                    return i;
                }

                for (int j = i * 2; j <= n; j += i) {
                    if (!isNotPrime[j]) {
                        isNotPrime[j] = true;
                        k--;
                    }
                    if (k == 0) {
                        return j;
                    }
                }
            }
        }
        return -1;
    }
}