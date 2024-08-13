import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> stack = new ArrayList<>();
        
        int N = Integer.parseInt(reader.readLine());
        
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            String command = reader.readLine();
            
            if (command.startsWith("push")) {
                int x = Integer.parseInt(command.split(" ")[1]);
                stack.add(x);
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    output.append(-1).append("\n");
                } else {
                    output.append(stack.remove(stack.size() - 1)).append("\n");
                }
            } else if (command.equals("size")) {
                output.append(stack.size()).append("\n");
            } else if (command.equals("empty")) {
                output.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("top")) {
                if (stack.isEmpty()) {
                    output.append(-1).append("\n");
                } else {
                    output.append(stack.get(stack.size() - 1)).append("\n");
                }
            }
        }
        System.out.print(output);
    }
}