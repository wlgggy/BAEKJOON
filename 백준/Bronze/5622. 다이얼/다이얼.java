import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toUpperCase();

        int totalTime = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int time = getTime(c);
            totalTime += time;
        }

        System.out.println(totalTime);
    }

    private static int getTime(char c) {
        if (c == 'A' || c == 'B' || c == 'C') return 3;
        if (c == 'D' || c == 'E' || c == 'F') return 4;
        if (c == 'G' || c == 'H' || c == 'I') return 5;
        if (c == 'J' || c == 'K' || c == 'L') return 6;
        if (c == 'M' || c == 'N' || c == 'O') return 7;
        if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') return 8;
        if (c == 'T' || c == 'U' || c == 'V') return 9;
        if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') return 10;
        return 0;
    }
}