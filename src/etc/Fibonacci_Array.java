package etc;

import java.util.Scanner;

/*
 * 피보나치(배열)
 * 백준_2747번
 */
public class Fibonacci_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n + 1];
		nums[0] = 0;
		nums[1] = 1;
		
		for(int i = 2; i < n + 1; i++) {
			nums[i] = nums[i - 1] + nums[i - 2];
		}
		
		System.out.println(nums[n]);
		sc.close();
	}
}