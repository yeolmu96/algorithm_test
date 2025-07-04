package stage006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_1316번
 * https://www.acmicpc.net/problem/1316
 * 
 * 효율화 버전
 * 
 */
public class Exam007 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0; 
		
		while((n--) > 0) {
			//문자열을 반복문 횟수만큼 하나씩 읽음
			String word = br.readLine();
			//나왔던 값인지 저장하는 배열(a~z)
			boolean[] check = new boolean[26];
			//나왔던 값인지 확인하는 변수
			boolean isGroupWord = true;
			//문자열 하나하나 비교하기 위한 임시 변수
			char prev = 0;
			
			for(int i = 0; i < word.length(); i++) {
				char now = word.charAt(i);
				if(now != prev) {
					if(check[now - 'a']) {
						isGroupWord = false;
						break;
					}
					check[now - 'a'] = true;
				}
				prev = now;
			}
			if(isGroupWord) {
				count++;
			}
		}	
		System.out.println(count);
	}
}