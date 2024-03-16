import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();

        int item = scanner.nextInt();

        int calculate = 0;
        for (int i = 0; i < item; i++) {
            int price = scanner.nextInt();
            int quantity = scanner.nextInt();
            calculate += price * quantity;
        }

        if (calculate == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}