package stage003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam10_01 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < (n - i - 1); j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
