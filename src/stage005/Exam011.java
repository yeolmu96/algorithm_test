package stage005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준_11718번_그대로 출력하기
 * https://www.acmicpc.net/problem/11718
 * 
 */
public class Exam011 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line;
		
		//빈줄이거나 EOF면 종료
		while((line = br.readLine()) != null && !line.isEmpty()) {
			sb.append(line).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
