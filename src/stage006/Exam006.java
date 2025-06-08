package stage006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_2941번
 * https://www.acmicpc.net/problem/2941
 * replace()로 치환
 * 
 * 
 * ljes=njak
 * 
 * 6
 * 
 */
public class Exam006 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] data = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(String pattern : data) {
			str = str.replace(pattern, "*");
		}
		
		System.out.println(str.length());
	}
}