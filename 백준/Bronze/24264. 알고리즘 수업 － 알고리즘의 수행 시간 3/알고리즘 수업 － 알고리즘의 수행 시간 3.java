import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int n = scanner.nextInt();
        
        long executionCount = (long) n * n;
        
        System.out.println(executionCount);
        System.out.println(2);
        
        scanner.close();
    }
}