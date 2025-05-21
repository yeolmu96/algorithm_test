package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_2750번_카드
 * https://www.acmicpc.net/problem/2750
 * 
 */
public class Exam03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		
		for(int i = 0; i < n ; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < nums.length - 1 ; i++) {
			for(int j = 0; j < nums.length - 1 - i; j++) {
				if(nums[j] > nums[j + 1]) {
					int temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}