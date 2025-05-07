package stage004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 백준 10810번
 */
public class Exam005 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br. readLine());
		
		//바구니 수 n개, 공 횟수 m번
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[n];
		
		//n개의 바구니에 공을 m번 던지기
		for(int p = 1; p <= m; p++) {
			String[] input = br.readLine().split(" ");
			//i~j까지 k번의 공을 넣기
			int i = Integer.parseInt(input[0]);
			int j = Integer.parseInt(input[1]);
			int k = Integer.parseInt(input[2]);
			
			for(int q = i - 1; q < j; q++) {
				basket[q] = k;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(basket[i] + " ");
		}
	}
}