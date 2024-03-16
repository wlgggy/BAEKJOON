import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.next();
        String num2 = scanner.next();

        String reversedNum1 = new StringBuilder(num1).reverse().toString();
        String reversedNum2 = new StringBuilder(num2).reverse().toString();

        int reversedInt1 = Integer.parseInt(reversedNum1);
        int reversedInt2 = Integer.parseInt(reversedNum2);

        System.out.println(Math.max(reversedInt1, reversedInt2));
    }
}