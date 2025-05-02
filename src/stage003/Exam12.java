package stage003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		
		//파일의 끝을 확인함
		while((input = br.readLine()) != null) {
			String[] parts = input.split(" ");
			int a = Integer.parseInt(parts[0]);
			int b = Integer.parseInt(parts[1]);
		
			System.out.println(a + b);
		}
	}
}