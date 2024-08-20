import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            String[] numbers = br.readLine().split(" ");
            int A = Integer.parseInt(numbers[0]);
            int B = Integer.parseInt(numbers[1]);
            int sum = A + B;
            bw.write(sum + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}