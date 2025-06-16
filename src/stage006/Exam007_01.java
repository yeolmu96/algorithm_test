package stage006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_1316번
 * https://www.acmicpc.net/problem/1316
 * 
 */
public class Exam007_01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] data = new String[n];
		int count = 0;
		
		//읽어들인 문자열 저장
		for(int i = 0; i < n; i++) {
			data[i] = br.readLine();
		}
				
		for(int i = 0; i < n; i++) {
			String word = data[i];
			//단어마다 확인 회수가 초기화 될 수 있도록
			boolean[] check = new boolean[26];
			boolean isGroupWord = true;
			//이미 등장했던 알파벳 저장
			char prev = 0;
			
			for(int j = 0; j < word.length(); j++) {
				char now = word.charAt(j);
				
				//이전에 나왔던 알파벳이라면
				if(now != prev) {
					if(check[now - 'a']) {
						//그룹 단어가 아님
						isGroupWord = false;
						break;
					}
					//처음 등장 기록
					check[now - 'a'] = true;
				}
				prev = now;	
			}
			if(isGroupWord) count++;
		}
		System.out.println(count);
	}
}