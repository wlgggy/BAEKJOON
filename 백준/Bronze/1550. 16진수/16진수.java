import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hexNumber = scanner.next();

        int decimalNumber = Integer.parseInt(hexNumber, 16);

        System.out.println(decimalNumber);
    }
}