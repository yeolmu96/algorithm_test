package stage004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준 10818번
 */
public class Exam003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(str[i]);
		}
		
		for(int j = 0; j < n - 1; j++) {
			for(int i = 0; i < n - 1 - j; i++) {
				if(nums[i] > nums [i + 1]) {
					int temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
			}
		}
		
		int min = nums[0];
		int max = nums[n - 1];
		
		System.out.println(min + " " + max);
	}
}
