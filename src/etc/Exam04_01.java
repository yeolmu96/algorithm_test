package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam04_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] charArr = br.readLine().toCharArray();
		char max = 0;
		
		for(int i = 0; i < charArr.length - 1; i++) {
			for(int j = 0; j < charArr.length - 1 - i; j++) {
				if(charArr[j] < charArr[j + 1]) {
					max = charArr[j + 1];
					charArr[j + 1] = charArr[j];
					charArr[j] = max;
				}
			}
		}
		
		for(char c : charArr) {
			System.out.print(c);
		}
	}
}