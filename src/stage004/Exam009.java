package stage004;

import java.util.Scanner;

/*
 * 백준 10811번
 * 
 * 바구니 n개
 * 역순으로 만들 범위 m개(i부터 j까지)
 */
public class Exam009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int temp = 0;
		
		int[] basket = new int[n];
		
		//바구니 숫자 입력하기
		for(int x = 0; x < n; x++) {
			basket[x] = x + 1;
		}
		
		for(int x = 0; x < m; x++) {
			int i = sc.nextInt() - 1; //시작 번호를 배열 순위 0으로 맞추기
			int j = sc.nextInt() - 1; //끝 번호

			for(int y = i; y < j; y++) {
				temp = basket[y];
				basket[y] = basket[j];
				basket[j] = temp;
				j--;
			}
		}
		
		for(int x = 0; x < n; x++) {
			System.out.print(basket[x] + " ");
		}
	}
}