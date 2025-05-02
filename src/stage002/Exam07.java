package stage002;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int prize = 0;
		
		//모든 변수가 다르다
		if(a != b && a != c && b != c) {
			int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
			prize = max * 100;
		}else {
			//세 변수가 같다
			if(a == b && b == c) {
				prize = 10000 + a * 1000;
			}else {
				//a가 b or c랑 같다
				if(a == b || a == c) {
					prize = 1000 + a * 100;
				} else {
					prize = 1000 + b * 100;
				}
			}
		}
		
		System.out.println(prize);
	}
}