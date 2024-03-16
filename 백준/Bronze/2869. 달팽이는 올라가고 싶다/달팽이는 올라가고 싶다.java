import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(); // 낮에 올라가는 높이
        int B = scanner.nextInt(); // 밤에 미끄러지는 높이
        int V = scanner.nextInt(); // 나무 막대의 높이

        System.out.println(daysToClimb(A, B, V));
    }

    private static int daysToClimb(int A, int B, int V) {
        int days = (V - B - 1) / (A - B) + 1;
        return days;
    }
}