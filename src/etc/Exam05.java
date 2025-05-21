package etc;
/*
 * 백준_11399번_정렬
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] p = new int[n];
		int total = 0;
		int result = 0;
		
		//돈을 인출하는데 걸리는 시간을 배열에 담기
		for(int i = 0; i < n; i++) {
			p[i] = Integer.parseInt(str[i]);
		}
		
		//오름차순 삽입정렬
		for(int i = 1; i < n; i++) {
			for(int j = i; j > 0; j--) {
				if(p[j - 1] > p[j]) {
					int temp = p[j];
					p[j] = p[j - 1];
					p[j - 1] = temp;
				}else {
					break;
				}
			}
		}
		
		//누적
		for(int i : p) {
			total += i;
			result += total;
		}
		System.out.println(result);
	}
}