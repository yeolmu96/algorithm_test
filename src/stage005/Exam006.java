package stage005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 백준_10809번_문자열
 * https://www.acmicpc.net/problem/11720
 * 
 */
public class Exam006 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] abc = new int[26];
		
		for(int i = 0; i < 26; i++) {
			abc[i] = -1; //-1로 초기화
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); //한글자씩 가져오기
			int idx = ch - 'a'; //아스키코드값 이용해서 인덱스 구하기(0,1,2,3, ...)
			if(abc[idx] == -1) { //처음 발견하면 위치(i)값 대입하기
				abc[idx] = i;
			}
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.print(abc[i] + " ");
		}
	}
}