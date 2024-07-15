import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        
        long numberOfOperations = n * n * n;
        int highestDegree = 3;
        
        System.out.println(numberOfOperations);
        System.out.println(highestDegree);
    }
}