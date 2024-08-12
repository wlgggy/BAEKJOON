import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String s = sc.nextLine();
            System.out.println(isValidParenthesis(s) ? "YES" : "NO");
        }
    }

    public static boolean isValidParenthesis(String s) {
        int balance = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance < 0) {
                    return false;
                }
            }
        }

        return balance == 0;
    }
}