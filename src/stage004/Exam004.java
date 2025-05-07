package stage004;
/*
 * 백준 2562번
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[9];
		int[] nums = new int[9];
		
		for(int i = 0; i < 9; i++) {
			str[i] = br.readLine();
		}
		
		for(int i = 0; i < 9; i++) {
			nums[i] = Integer.parseInt(str[i]);
		}
		
		int max = nums[0];
		int index = 1;
		
		for(int i = 1; i < 9; i++) {		
			if(max < nums[i]) {
				max = nums[i];
				index = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}