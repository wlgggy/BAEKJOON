import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int thaiYear = year - 543;

        System.out.println(thaiYear);
    }
}