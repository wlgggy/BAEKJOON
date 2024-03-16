import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for (int t = 0; t < testCase; t++) {
            int repeat = scanner.nextInt();
            String input = scanner.next();

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                for (int j = 0; j < repeat; j++) {
                    result.append(ch);
                }
            }

            System.out.println(result);
        }
    }
}