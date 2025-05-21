package stage005;
/*
 * 백준_2908번_문자열
 * https://www.acmicpc.net/problem/2908
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		char[] num1 = str[0].toCharArray();
		char[] num2 = str[1].toCharArray();
		
		char c = num1[0];
		num1[0] = num1[2];
		num1[2] = c;
		
		c = num2[0];
		num2[0] = num2[2];
		num2[2] = c;
		
		int n1 = Integer.parseInt(new String(num1));
		int n2 = Integer.parseInt(new String(num2));
		
		if(n1 > n2) {
			System.out.println(n1);
		}else if(n1 < n2) {
			System.out.println(n2);
		}
	}
}