package stage006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_1316번
 * https://www.acmicpc.net/problem/1316
 * 
 */
public class Exam007_02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0; 
		
		while(n --> 0) {
			String word = br.readLine();
			boolean[] check = new boolean[26];
			boolean isGroupWord = true;
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