package stage002;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int prize = 0;
		int max = 0;
		
		max = a > b ? (a > c ? a : c) : (b > c ? b : c) ;
		
		/*
		 * a=b, b=c 1, 1, 1
		 * a!=b, a=c 1, 2, 1
		 * b=c, a!=b 2, 1, 1
		 */
		
		if(a == b) {
			if(b == c) {
				prize = 10000 + a * 1000;
			} else {
				prize = 1000 + a * 100;
			}
		}else if (b == c){
			prize = 1000 + b * 100;
		}else {
			prize = max * 100;
		}
		System.out.println(prize);
	}
}