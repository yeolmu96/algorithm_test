package stage005;

/*
 * 백준 1152번
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam008 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim();
		
		if(str.isEmpty()) {
			System.out.println(0);
		}else {
			String[] strArr = str.split(" ");
			System.out.println(strArr.length);
		}
	}
}