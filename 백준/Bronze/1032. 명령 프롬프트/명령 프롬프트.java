import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        String[] fileNames = new String[N];

        for (int i = 0; i < N; i++) {
            fileNames[i] = scanner.next();
        }

        StringBuilder pattern = new StringBuilder(fileNames[0]);

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < pattern.length(); j++) {
                if (pattern.charAt(j) != fileNames[i].charAt(j)) {
                    pattern.setCharAt(j, '?');
                }
            }
        }
        System.out.println(pattern.toString());
    }
}