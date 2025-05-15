package stage005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_27866번_문자열
 * https://www.acmicpc.net/problem/27866
 */
public class Exam001 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(br.readLine());
		System.out.println(str.charAt(n - 1));
		br.close();
	}
}