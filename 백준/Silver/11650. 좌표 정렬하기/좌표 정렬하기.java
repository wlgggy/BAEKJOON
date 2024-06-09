import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] points = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] p1, int[] p2) {
                if (p1[0] != p2[0]) {
                    return Integer.compare(p1[0], p2[0]);
                } else {
                    return Integer.compare(p1[1], p2[1]);
                }
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }
    }
}