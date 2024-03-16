import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (isGroupWord(scanner.next())) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (visited[currentChar - 'a']) {
                return false;
            }

            while (i < word.length() - 1 && currentChar == word.charAt(i + 1)) {
                i++;
            }

            visited[currentChar - 'a'] = true;
        }

        return true;
    }
}