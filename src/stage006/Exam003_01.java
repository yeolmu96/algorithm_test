package stage006;

import java.util.Scanner;

/*
 * 백준_2444번
 * https://www.acmicpc.net/problem/2444
 * 
 */
public class Exam003_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= 2*n-1; i++) {
			int stars;
			int spaces;
			
			if(i <= n) {
				stars = 2 * i - 1;
				spaces = n - i;
			} else {
				stars = 2 * (2 * n - i) - 1;
				spaces = i - n;
			}
			
			printChars(' ', spaces);
			printChars('*', stars);
			System.out.println();
		}
		sc.close();
	}
	
	private static void printChars(char ch, int count) {
		for(int j = 0; j < count; j++) {
			System.out.print(ch);
		}
	}
}
