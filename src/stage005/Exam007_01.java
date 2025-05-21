package stage005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam007_01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String[] str = br.readLine().split(" ");
			int r = Integer.parseInt(str[0]);
			char[] ch = str[1].toCharArray();
			
			for(int j = 0; j < ch.length; j++) {
				for(int k = 0; k < r; k++) {
					System.out.print(ch[j]);
				}
			}
			System.out.println();	
		}
	}
}