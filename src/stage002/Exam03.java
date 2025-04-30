package stage002;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		//4의 배수이면서 100의 배수가 아님
		//또는 400의 배수
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if((year % 4) == 0 && (year % 100) != 0) {
			System.out.println(1);
		}else if((year % 400) == 0) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}