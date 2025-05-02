package stage003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam06_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String[] nums = br.readLine().split(" ");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			sb.append(a + b).append('\n');
		}
		
		System.out.print(sb);
	}

}
