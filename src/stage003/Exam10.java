package stage003;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "*";
		
		for (int i = 0; i < n; i++) { //0~4
			
			for(int j = 0; j < (n - i - 1); j++) {//0~3
				System.out.print(" ");
			}
			
			for (int j = 0; j < (i + 1); j++) {//0~0
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}