package stage003;

import java.util.Scanner;

/*
 * 백준 10950번
 */
public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int a = 0, b = 0;
		int[] result = new int[testCase];
		
		for(int i = 0; i < testCase; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			result[i] = a + b;
		}
		
		for(int i = 0; i < testCase; i++) {
			System.out.println(result[i]);
		}
	}
}