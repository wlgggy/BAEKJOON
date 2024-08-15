import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(scanner.nextInt());
        }

        int M = scanner.nextInt();

        for (int i = 0; i < M; i++) {
            int query = scanner.nextInt();
            if (set.contains(query)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}