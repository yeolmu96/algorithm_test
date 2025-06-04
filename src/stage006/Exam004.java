package stage006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_10988번
 * https://www.acmicpc.net/problem/10988
 * 
 */
public class Exam004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] ch = br.readLine().toCharArray();
		int result = 0;
		
		for(int i = 0; i < ch.length / 2; i++) {
			if(ch[i] == ch[ch.length - i - 1]) {
				continue;
			}else {
				result = 1;
				break;
			}
		}
		if(result == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}