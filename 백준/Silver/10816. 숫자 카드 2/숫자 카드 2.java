import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        HashMap<Integer, Integer> cardCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int card = scanner.nextInt();
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }

        int m = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            int target = scanner.nextInt();
            result.append(cardCount.getOrDefault(target, 0)).append(" ");
        }

        System.out.println(result.toString().trim());

    }
}