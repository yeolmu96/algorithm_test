package stage003;

import java.util.Scanner;

/*
 * 백준 25304번
 */
public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//영수증 총 금액
		int x = sc.nextInt();
		//영수증 물건 종류의 수
		int n = sc.nextInt();
		//물건 값
		int[] a = new int[n];
		//물건 개수
		int[] b = new int[n];
		int total = 0;
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			total += a[i] * b[i];
		}
		
		if(x == total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}