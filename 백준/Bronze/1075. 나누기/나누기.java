import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int N = scanner.nextInt();
        int F = scanner.nextInt();
        
        // 마지막 두 자리를 00으로 바꾼 N_new 계산
        int N_new = (N / 100) * 100;
        
        // 00부터 99까지 반복하면서 F로 나누어 떨어지는 가장 작은 값을 찾음
        int result = 0;
        for (int i = 0; i < 100; i++) {
            if ((N_new + i) % F == 0) {
                result = i;
                break;
            }
        }
        
        // 두 자리 형식으로 출력
        System.out.printf("%02d", result);
    }
}
