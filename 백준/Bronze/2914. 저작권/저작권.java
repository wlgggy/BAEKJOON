import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int I = scanner.nextInt();

        int minMelodies = A * (I - 1) + 1;

        System.out.println(minMelodies);
    }
}