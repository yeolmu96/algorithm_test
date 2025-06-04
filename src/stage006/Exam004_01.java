package stage006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_10988번
 * https://www.acmicpc.net/problem/10988
 * 
 */
public class Exam004_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		boolean result = true;
		
		for(int i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
				result = false;
				break;
			}
		}
		System.out.println(result ? 1 : 0);
	}
}