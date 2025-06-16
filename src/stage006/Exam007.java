package stage006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_1316번
 * https://www.acmicpc.net/problem/1316
 * 
 */
public class Exam007 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] data = new String[n];
		
		//이전 문자 기억하기
		char prev = 0;
		//알파벳이 등장한 적이 있는지 체크(26개)
		boolean[] check = new boolean[26];
		
		//n개의 문자열 입력 받기
		for(int i = 0; i < n; i++) {
			data[i] = br.readLine();
		}
		
		//각각의 문자열을 문자형으로 변환하기
		for(int i = 0; i < n; i++) {
			
		}
	}
}