import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int word = count(input);

        System.out.println(word);
    }

    private static int count(String input) {

        input = input.trim();

        if (input.isEmpty()) {
            return 0;
        }

        int space = 0;
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                space++;
            }
        }

        return space + 1;
    }
}
