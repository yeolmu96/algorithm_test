package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_1427번_정렬
 * https://www.acmicpc.net/problem/1427
 * 
 */
public class Exam04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] nums = new int[str.length()];
		int max = 0;
		
		for(int i = 0; i < str.length(); i++) {
			nums[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		
		for(int j = 0; j < str.length() - 1; j++) {
			for (int i = 0; i < str.length() - 1 - j; i++) {
				if (nums[i] < nums[i + 1]) {
					max = nums[i + 1];
					nums[i + 1] = nums[i];
					nums[i] = max;
				}
			}
		}
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(nums[i]);
		}
	}
}