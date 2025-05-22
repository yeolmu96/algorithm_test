package stage005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_5622번
 * https://www.acmicpc.net/problem/5622
 * 
 */
public class Exam010 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] strArr = str.toCharArray();
		
		int[] num = new int[26];
		num[0] = 2; // 숫자 1번은 2초가 걸림
		num[1] = 3; // a 2
		num[2] = 3; // b 2
		num[3] = 3; // c 2
		
	}
}