import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(reader.readLine());
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < K; i++) {
            int number = Integer.parseInt(reader.readLine());
            
            if (number == 0) {
                stack.pop();
            } else {
                stack.push(number);
            }
        }
        
        int sum = 0;
        for (int num : stack) {
            sum += num;
        }
        
        System.out.println(sum);
    }
}