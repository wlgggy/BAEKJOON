import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = scanner.nextInt();
        int current = 1;

        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int target = scanner.nextInt();

            if (current <= target) {
                while (current <= target) {
                    stack.push(current++);
                    result.append("+\n");
                }
            }
            if (stack.peek() == target) {
                stack.pop();
                result.append("-\n");
            } else {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.print(result.toString());
        } else {
            System.out.println("NO");
        }
    }
}