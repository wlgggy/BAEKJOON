import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            set.add(num);
        }
        
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        
        for (int num : sortedList) {
            System.out.print(num + " ");
        }
    }
}