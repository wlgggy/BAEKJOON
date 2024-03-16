import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int T = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < T; i++) {
                String inputStr = scanner.nextLine().trim();
                char firstChar = inputStr.charAt(0);
                char lastChar = inputStr.charAt(inputStr.length() - 1);
                System.out.println("" + firstChar + lastChar);
          }
    }
}