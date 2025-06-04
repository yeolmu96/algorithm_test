package stage006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_1157번
 * https://www.acmicpc.net/problem/1157
 * 
 */
public class Exam005 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str.toUpperCase();
		char[] ch = str.toCharArray();
		int[] data = new int[26];
		
		//알파벳 배열을 만들어서 해당 알파벳과 맞으면 값을 ++ 하는 걸로?
		
		for(int i = 0; i < ch.length; i++) {
			data[ch[i] - 'A']++; //char[i] - 'a' => 0~25사이값!!
		}
		
		int max = -1;
		int maxIndex = -1;
		int maxCount = 0;
		for(int i = 0; i < data.length; i++) {
			if(max < data[i]) {
				max = data[i];
				maxIndex = i;
				maxCount = 1;
			} else if(max == data[i]) {
				maxCount++;
			}
		}
		
		if(maxCount == 1) {
			System.out.println((char)(maxIndex + 'A'));
		}else {
			System.out.println("?");
		}
	}
}