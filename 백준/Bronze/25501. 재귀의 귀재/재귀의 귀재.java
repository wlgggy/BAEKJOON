import java.util.Scanner;

public class Main {
    static int callCount;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            String S = scanner.nextLine();
            
            callCount = 0;
            int result = isPalindrome(S);
            System.out.println(result + " " + callCount);
        }
    }

    public static int recursion(String s, int l, int r) {
        callCount++;
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
}