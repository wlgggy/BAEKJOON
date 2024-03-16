import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;  // 입력이 모두 0일 때 종료
            }

            String result = determineTriangleType(a, b, c);
            System.out.println(result);
        }
    }

    private static String determineTriangleType(int a, int b, int c) {
        if (a + b > c && b + c > a && c + a > b) {
            if (a == b && b == c) {
                return "Equilateral";
            } else if (a == b || b == c || c == a) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        } else {
            return "Invalid";
        }
    }
}