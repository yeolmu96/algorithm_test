package stage005;

import java.util.Scanner;

/*
 * 백준_9086번_문자열
 * https://www.acmicpc.net/problem/9086
 */
public class Exam003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < test; i++) {
			String str = sc.nextLine();
			System.out.print(str.charAt(0) + str.charAt(str.length() - 1) + "\n");
		}
		
		sc.close();
	}
}