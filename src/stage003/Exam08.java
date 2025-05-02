package stage003;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[] a = new int[testCase];
		int[] b = new int[testCase];
		int[] nums = new int[testCase];
		
		for(int i = 0; i < testCase; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			nums[i] = a[i] + b[i];
//			System.out.println("Case #" + (i + 1) + ": " + a[i] + " + " + b[i] + " = " + nums[i]);
		}
		
		for(int i = 0; i < testCase; i++) {
			System.out.println("Case #" + (i + 1) + ": " + a[i] + " + " + b[i] + " = " + nums[i]);
		}
	}
}