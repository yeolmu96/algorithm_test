package stage005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_11654번_문자열
 * https://www.acmicpc.net/problem/11654
 */
public class Exam004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char c = str.charAt(0);
			System.out.println((int)c);
	}
}