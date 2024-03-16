import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        int x4 = findFourthPoint(x1, x2, x3);
        int y4 = findFourthPoint(y1, y2, y3);

        System.out.println(x4 + " " + y4);
    }

    private static int findFourthPoint(int a, int b, int c) {
        return (a == b) ? c : (a == c) ? b : a;
    }
}