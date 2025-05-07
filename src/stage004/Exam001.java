package stage004;
/*
 * 백준 10807번
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam001 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		int v = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == v) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
