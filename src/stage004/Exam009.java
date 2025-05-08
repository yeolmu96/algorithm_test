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
		
		int[] basket = new int[n];
		
		//바구니 숫자 입력하기
		for(int x = 0; x < n; x ++) {
			basket[x] = x + 1;
		}
		
		for(int x = 0; x < m; x++) {
			int i = sc.nextInt(); //시작 번호
			int j = sc.nextInt(); //끝 번호
			int temp = j - i + 1;
			
			for(int y = 0; y < temp; y++) {
				basket[i] = j;
				i++;
				j--;
				
				if(i == j) {
					break;
				}
			}
		}
	}
}