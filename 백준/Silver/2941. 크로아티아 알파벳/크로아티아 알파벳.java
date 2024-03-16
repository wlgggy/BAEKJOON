import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int count = 0;
        int index = 0;
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        while (index < word.length()) {
            boolean found = false;

            for (String croatianChar : croatian) {
                if (word.startsWith(croatianChar, index)) {
                    index += croatianChar.length();
                    found = true;
                    break;
                }
            }

            if (!found) {
                index++;
            }

            count++;
        }

        System.out.println(count);
    }
}