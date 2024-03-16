import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n[][] = new int[9][9];
		int max = -1;
		int a=0; 
		int b = 0;
		
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				n[i][j] = sc.nextInt();
				if(max < n[i][j]){
					max = n[i][j];
					a = i+1;
					b = j+1;
				}
			}
		}
		System.out.printf("%d\n%d %d", max, a, b);		
	}
}