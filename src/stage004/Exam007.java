package stage004;
/*
 * 백준 5597번
 */
import java.util.Scanner;

public class Exam007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result = new int[30];
		int temp = 0;
		
		for(int i = 0; i < 28; i++) {
			temp = sc.nextInt();
			result[temp - 1] = 1;
		}
		
		for(int i = 0; i < 30; i++) {
			if(result[i] == 0) {
				System.out.println(i + 1);
			}
		}
	}
}