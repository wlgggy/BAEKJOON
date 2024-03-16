import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String word = scanner.nextLine();

            if (isPalindrome(word)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        public static boolean isPalindrome(String word) {
            String reversed = new StringBuilder(word).reverse().toString();
            return word.equals(reversed);
        }
    }