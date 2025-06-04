package stage006;

import java.util.Scanner;

/*
 * 백준_2444번
 * https://www.acmicpc.net/problem/2444
 * 
 */
public class Exam003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= 2*n-1; i++) {
			int stars = 0;
			int spaces = 0;
			
			if(i <= n) {
				stars = 2 * i - 1;
				spaces = n - i;
			} else {
				stars = 2 * (2 * n - i) - 1; //2*n-i는 역순 번호 (..., 4,3,2,1)
				spaces = i - n;
			}
			
			for(int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
