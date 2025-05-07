package stage004;
/*
 * 백준 10871번
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] parts = br.readLine().split(" ");
		
		int n = Integer.parseInt(parts[0]);
		int x = Integer.parseInt(parts[1]);
		
		String[] nums = br.readLine().split(" ");
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(nums[i]);
		}
		
		for(int i = 0; i < n; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
