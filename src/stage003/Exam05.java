package stage003;

import java.util.Scanner;

/*
 * 백준 25314번
 */
public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n / 4;
		
		for(int i = 0; i < temp; i++) {
			System.out.print("long ");
		}
		
		System.out.println("int");
	}
}