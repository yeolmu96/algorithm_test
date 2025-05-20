package stage005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_11720번_문자열
 * https://www.acmicpc.net/problem/11720
 * 
 */
public class Exam005 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			result = result + str.charAt(i) - '0'; //유니코드 48을 빼줌
		}
		
		System.out.println(result);
	}
}