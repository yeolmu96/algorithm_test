package stage005;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 백준_9086번_문자열
 * https://www.acmicpc.net/problem/9086
 */
public class Exam003_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String line = br.readLine();
			bw.write(line.charAt(0));
			bw.write(line.charAt(line.length() - 1));
			bw.newLine(); // 줄바꿈
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}