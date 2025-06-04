package stage005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_5622번
 * https://www.acmicpc.net/problem/5622
 * 
 * 숫자 | 알파벳 | 걸리는 시간
----|--------|-------------
 2  | ABC    |     3초
 3  | DEF    |     4초
 4  | GHI    |     5초
 5  | JKL    |     6초
 6  | MNO    |     7초
 7  | PQRS   |     8초
 8  | TUV    |     9초
 9  | WXYZ   |    10초
 
 char - 'A' -> 0부터 25사이의 인덱스
 * 
 */
public class Exam010_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int[] time = new int[26];
		
		for(char c : "ABC".toCharArray()) {
			time[c - 'A'] = 3;
		}
		for(char c : "DEF".toCharArray()) {
			time[c - 'A'] = 4;
		}
		for(char c : "GHI".toCharArray()) {
			time[c - 'A'] = 5;
		}
		for(char c : "JKL".toCharArray()) {
			time[c - 'A'] = 6;
		}
		for(char c : "MNO".toCharArray()) {
			time[c - 'A'] = 7;
		}
		for(char c : "PQRS".toCharArray()) {
			time[c - 'A'] = 8;
		}
		for(char c : "TUV".toCharArray()) {
			time[c - 'A'] = 9;
		}
		for(char c : "WXYZ".toCharArray()) {
			time[c - 'A'] = 10;
		}
		
		int totalTime = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			totalTime += time[ch - 'A'];
		}
		
		System.out.println(totalTime);
	}
}