package stage003;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int a = 0, b = 0;
		int[] nums = new int[testCase];
		
		for(int i = 0; i < testCase; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			nums[i] = a + b;
		}
		
		for(int i = 0; i < testCase; i++) {
			System.out.println("Case #" + (i + 1) + ": " + nums[i]);
		}
	}
}