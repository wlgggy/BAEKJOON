import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dice = new int[3];

        for (int i = 0; i < 3; i++) {
            dice[i] = scanner.nextInt();
        }

        int prize = calculatePrize(dice);

        System.out.println(prize);

        scanner.close();
    }
    
    private static int calculatePrize(int[] dice) {
        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            return 10000 + dice[0] * 1000;
        } else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[0] == dice[2]) {
            int sameEye = (dice[0] == dice[1]) ? dice[0] : (dice[1] == dice[2]) ? dice[1] : dice[0];
            return 1000 + sameEye * 100;
        } else {
            int maxEye = Math.max(Math.max(dice[0], dice[1]), dice[2]);
            return maxEye * 100;
        }
    }
}