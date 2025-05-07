package stage004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam004_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] nums = new int[9];
		
		for(int i = 0; i < 9; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		int max = nums[0];
		int index = 1;
		
		for(int i = 1; i < 9; i++) {
			if (max < nums[i]) {
				max = nums[i];
				index = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}

}
