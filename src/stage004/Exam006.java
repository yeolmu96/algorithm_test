package stage004;
/*
 * 백준 10813번
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Exam006 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//n개의 바구니, 횟수는 m
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//n개의 바구니 생성
		int[] basket = new int[n];
		
		//n개의 바구니에 번호 적힌 공 넣어주기
		for(int i = 0; i < n; i++) {
			basket[i] = (i + 1);
		}
		
		//횟수 m
		for(int a = 0; a < m; a++) {
			String[] str = br.readLine().split(" ");
			int i = Integer.parseInt(str[0]) - 1;
			int j = Integer.parseInt(str[1]) - 1;
			int temp = basket[i];
			basket[i] = basket[j];
			basket[j] = temp;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(basket[i] + " ");
		}
	}
}