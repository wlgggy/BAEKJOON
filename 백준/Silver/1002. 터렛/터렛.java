import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();
            
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // 두 터렛 사이의 거리

            if (distance == 0 && r1 == r2) {
                System.out.println(-1);
            } else if (distance > r1 + r2 || distance < Math.abs(r1 - r2)) {
                System.out.println(0);
            } else if (distance == r1 + r2 || distance == Math.abs(r1 - r2)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        scanner.close();
    }
}