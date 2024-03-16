import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toUpperCase();
        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            count[currentChar - 'A']++;
        }

        int maxCount = 0;
        char resultChar = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                resultChar = (char) ('A' + i);
            } else if (count[i] == maxCount) {
                resultChar = '?';
            }
        }

        System.out.println(resultChar);
    }
}