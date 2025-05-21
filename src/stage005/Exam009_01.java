package stage005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_2908번_문자열
 * https://www.acmicpc.net/problem/2908
 * 
 * 복잡한 체이닝****
 * 
 */
public class Exam009_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int n1 = Integer.parseInt(new StringBuilder(str[0]).reverse().toString());
		int n2 = Integer.parseInt(new StringBuilder(str[1]).reverse().toString());
		
		System.out.println(Math.max(n1, n2));
	}
}