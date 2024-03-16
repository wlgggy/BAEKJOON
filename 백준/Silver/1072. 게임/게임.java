import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long X = scanner.nextLong();
        long Y = scanner.nextLong();

        long Z = (Y * 100) / X;

        if (Z >= 99) {
            System.out.println("-1");
            return;
        }

        long left = 0, right = 1000000000;
        long answer = -1;

        while (left <= right) {
            long mid = (left + right) / 2;
            long newZ = ((Y + mid) * 100) / (X + mid);

            if (newZ > Z) {
                right = mid - 1;
                answer = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }
}