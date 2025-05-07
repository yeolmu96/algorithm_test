package stage004;
/*
 * 백준 10818번
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam003_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(str[i]);
		}
		
		int min = nums[0];
		int max = nums[0];
		
		for(int i = 0; i < n; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		
		System.out.println(min + " " + max);
	}
}