import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Pieces = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            int actualPieces = scanner.nextInt();
            int difference = Pieces[i] - actualPieces;
            System.out.print(difference + " ");
        }
    }
}